package com.teachmeskills.homework4;

import java.util.Arrays;

public class Ex_3 {

    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double average1;
        double average2;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = min + (int) (Math.random() * max);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = min + (int) (Math.random() * max);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for(int num1: array1){
            sum1 = sum1 + num1;

        }
        for(int num2: array2){
            sum2 = sum2 + num2;
        }
        average1 = (double) sum1 / array1.length;
        average2 = (double) sum2 / array2.length;
        if(average1 > average2){
            System.out.println("The arithmetic mean of the first array is greater than that of the second ");
            System.out.println(average1 + ">" + average2);
        } else if (average1 < average2) {
            System.out.println("The arithmetic mean of the first array is less than that of the second ");
            System.out.println(average1 + "<" + average2);
        } else {
            System.out.println("The arithmetic mean of the first array is equal to the value of the second ");
            System.out.println(average1 + "=" + average2);
        }
    }
}
