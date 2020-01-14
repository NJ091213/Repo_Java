package Homework;
//Create methods to :
// 1. Reverse a string
// Eg: Input to method : Sample

import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Homework

{
    public static void main(String[] args) {
        String input = "Sample";
        char[] name1 = input.toCharArray();
        for (int i = name1.length - 1; i >= 0; i--)
            System.out.println(name1[i]);
        2. Reverse an array (fyi: length of input array can vary)
        Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
        int [] arr = {25,15,3,2,40};
        for (int i= 0; i< arr.length/2; i--){
            int j= arr[i];
            arr[i] = arr[arr.length-1-1];
            arr[arr.length -i-1] = j;
            Add all numbers in a given array (fyi: length of input array can vary)
*        Eg: Input to method : [20, 10, 40, 44

            int[] a ={20,10,40,44};
            int sum =
