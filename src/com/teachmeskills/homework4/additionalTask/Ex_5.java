package com.teachmeskills.homework4.additionalTask;

import java.util.Arrays;

public class Ex_5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                array[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
