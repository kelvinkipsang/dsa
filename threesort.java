/*
Create a ThreeSort class with a threeSort method and a main method.
The threeSort method should contain the algorithm and the main method
should be used for testing your algorithm. To make that easier, make the
threeSort method static.

Given three numbers as input, find the min, middle and max of the three.
Return an array of the numbers in ascending order.
Hint: to easily see your output, import java.util.Arrays
and use the Arrays.toString(array) method to convert the Array to a string
and then log it using System.out.println();
*/

import java.util.Arrays;
public class ThreeSort {
    public static int [] sorty(int x, int y, int z){
        int red [] = {x,y,z};
        Arrays.sort(red);

        System.out.println(Arrays.toString(red));
        System.out.println(Math.max(78,90));
        return red;
    }

    public static void main(String[] args) {
        sorty(8,521,89);
    }
}
