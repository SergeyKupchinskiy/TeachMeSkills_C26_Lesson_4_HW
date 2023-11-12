package com.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_0 {

    public static void main(String[] args) {
        System.out.println("Enter the number you are looking for");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] array = {6, 20, 24, 35, 8 , 11};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int binarySearch = Arrays.binarySearch(array,a);
        if(binarySearch >= 0){
            System.out.println("The array contains this number");
        } else{
            System.out.println("Array does not contain this number");
        }

    }
}