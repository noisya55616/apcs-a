import java.io.*;
import java.util.*;

public class Main {
    /**
     * 
     * @param intArr is an Integer array
     * @param intTarget is a value to be found in intArr
     * @return the index of intTarget if found in intArr else return -1;
     */

    public static int LinearSearch(int [] intArr, int intTarget){

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == intTarget) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] intArr1 = {-10,100,87,45,35,23,12};
        System.out.println(LinearSearch(intArr1, 100));
        System.out.println(LinearSearch(intArr1, -100));
    }
    
}
