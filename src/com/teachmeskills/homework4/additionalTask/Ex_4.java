package com.teachmeskills.homework4.additionalTask;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than 5 and less than or equal to 10");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        while(size <= 5 || size > 10){
            System.out.println("Wrong number! Please, try again");
            size = scanner.nextInt();
        }
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] %2 == 0){
                count++;

            }
        }
        int[] array2 = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                array2[j] = array[i];
                j = j + 1;
            }
        }
        System.out.println(Arrays.toString(array2));

    }
}
