import java.io.*; 
import java.util.*; 

public class Sound {

    private int[] samples;

    public Sound(int[] input) {
        samples = input;
    }

    public int[] get() {
        return samples;
    }

    /**
     * 
     * @param limit is an integer that is the maximum/minimum amplitude value
     * @return the amount of values that are changed
     */
    public int limitAmplitude(int limit) {
        int changes = 0;

        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                changes++;
                samples[i] = limit;
            }
            if (samples[i] < 0 - limit) {
                changes++;
                samples[i] = 0 - limit;
            }
        }

        return changes;
    }
    
    public void trimSilenceFromBeginning() {
        int silenceIndex = -1;
        int q = 0;
        while (samples[q] == 0) {
            silenceIndex = q;
            q++;
        }

        int[] newSamples = new int[samples.length - silenceIndex - 1];

        for (int i = silenceIndex + 1; i < samples.length && i >= 0; i++) {
            newSamples[i - silenceIndex - 1] = samples[i]; 
        }

        samples = newSamples;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr = {0, 0, 0, 0, 1200, 1300, 1700, 1500, 0, 0, 300, -2000, 1000, -300, -4000};
        int[] arr2 = {300, -2000, 1000, -300, 1200, 1300, 1700, 1500, 0, 0, 300, -2000, 1000, -300, -4000};

        Sound sound1 = new Sound(arr);
        Sound sound2 = new Sound(arr2);

        sound1.trimSilenceFromBeginning();
        sound1.limitAmplitude(1500);

        sound2.trimSilenceFromBeginning();

        for (int i = 0; i < sound1.get().length; i++) {
            System.out.print(sound1.get()[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < sound2.get().length; i++) {
            System.out.print(sound2.get()[i] + " ");
        }

        input.close();
    }
}