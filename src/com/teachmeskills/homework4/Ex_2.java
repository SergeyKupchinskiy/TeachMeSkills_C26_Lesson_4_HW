package com.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int min = 0;
        int max = 100;
        int sum = 0;

        for( int i = 0; i<arraySize; i++){
            array[i] = min + (int) (Math.random() * max);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for( int num : array) {
            sum = sum + num;
        }
        System.out.println("Arrays min = " + array[0]);
        System.out.println("Arrays max = " + array[arraySize - 1]);
        System.out.println("Arrays arithmetical mean = " + sum/arraySize);

    }
}
