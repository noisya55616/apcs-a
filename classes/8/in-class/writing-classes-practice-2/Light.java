import java.util.*; 

public class Light

{

	// Variables that will be initialized in the Light constructors.

	private boolean on;

	boolean burntOut;

	String color = "";


	// Default constructor that sets the bulb to on, not burnt out, and "white".

	public Light()

	{
        on = true;

        burntOut = false;

        color = "white";

	}


	// This constructor sets the variable "on" to the parameter o. The burntOut

	// variable is set to the parameter b. If burntOut

	// is true, on is set to false, no matter what value is stored in o.

	// The color variable is set to the parameter c only if c is "red", "green"

	// or "blue". The constructor ignores the case of the value in c. If c holds

	// any value other than "red", "green" or "blue", the constructor sets

	// color to "white".

	public Light(boolean o, boolean b, String c)

	{

        burntOut = b;
        
        if (burntOut) on = false;
        else on = o;

        c = c.toLowerCase();

        if (c.equals("red") || c.equals("blue") || c.equals("green")) color = c;
        else color = "white";

	}


	// The toString method returns a String with the Light in the format:

	// off red    burnt out

	// on green    not burnt out

	//

	// Notice there is one space between "off"/"on" and the value for color,

	// and a tab before the "burnt out" or "not burnt out".

	public String toString()

	{

        String output = "";
        
        if (on) output += "on ";
        else if (!on) output += "off ";

        output += color + " ";

        if (burntOut) output += "burnt out";
        else if (!burntOut) output += "not burnt out";

		return output;

	}


	// This method changes the bulb from on to off, or visa versa. If the

	// burntOut variable is true, then the on variable may only be set to false.

	public void flip()

	{

        if (!burntOut) on = (!on);
        else on = false;

	}


	// The getColor method returns the color of the bulb.

	public String getColor()

	{

		return color;

	}


	// The setColor method sets the color of the Light. The color variable is

	// set to c only if c is "red", "green" or "blue". The method ignore the

	// case of the value in c. If c holds any value other than "red", "green"

	// or "blue", color will be set to "white".

	public void setColor(String c)

	{

		if (c.equals("red") || c.equals("blue") || c.equals("green")) color = c;
        else color = "white";

	}


	// The isOn method returns true if on, false otherwise.

	public boolean isOn()

	{

		return on;

	}


	// The burnOut method sets the variable burntOut to true.

	public void burnOut()

	{

        burntOut = true;
        on = false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oIn = input.nextInt();
        int bIn = input.nextInt();
        String c = input.next();

        boolean o = (oIn == 1), b = (bIn == 1);

        Light light1 = new Light(o, b, c);

        System.out.println(light1.toString());

        input.close();
    }
}