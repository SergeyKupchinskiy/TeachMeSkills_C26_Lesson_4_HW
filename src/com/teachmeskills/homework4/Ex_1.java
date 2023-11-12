package com.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array1 = {37,5,53,64};
        int length = array1.length;
        int count = 0;
        System.out.println(Arrays.toString(array1));
        System.out.print("Enter the number you want to remove from the array : ");
        int numberToRemove = scanner.nextInt();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == numberToRemove) {
                count++;
            } else  {
                array1[i - count] = array1[i];
            }
        }
        int[] array2 = new int[length - count];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        if (array2.length == array1.length) {
            System.out.println("This number is not in this array");
        } else {
            System.out.println(Arrays.toString(array2));
        }
    }
}
