package Classwork;

import java.util.Arrays;

public class Midterm_Q2 {
    public static void main(String[] args) {
        int[] my_array = {32,14,24,98,24,56,148,24,78,24};
        System.out.println("Orginal Array :"+ Arrays.toString(my_array));
        int removeIndex = 1;
        for (int i = removeIndex;i< my_array.length -1; i++){
            my_array[i] = my_array[i+1];
            System.out.println("After removing the second element: "+Arrays.toString(my_array));
        }
    }
}
