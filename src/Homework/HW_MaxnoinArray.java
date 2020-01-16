package Homework;

import java.util.Arrays;

public class HW_MaxnoinArray {
    public static void main(String[] args) {
        int arr[] ={20,10,40,44,32};
        int max = Arrays.stream(arr).max().getAsInt();
       System.out.println("Largest in given array is"+max);

      int arr[]  ={20, 10, 40, 44};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum in given array is" + min);
    }

    }

/// 6.Find maximum number in given array
////*        Eg: Input to method : [20, 10, 40, 44, 32]
//7.Find minimum number in given array
//*        Eg: Input to method : [20, 10, 40, 44]
//8.Create abbreviation for any string
//*        Eg: Input to method : Outfit of the day
