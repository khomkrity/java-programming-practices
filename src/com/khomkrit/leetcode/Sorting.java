package com.khomkrit.leetcode;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] numbers = {3,2,5,9,7,1,4,6,10,8};
        System.out.println("Given array: "+Arrays.toString(numbers));
        //System.out.println("Bubble sort: "+ Arrays.toString(bubbleSort(numbers)));
        //System.out.println("Selection sort: "+ Arrays.toString(selectionSort(numbers)));
        System.out.println("Insertion sort: "+Arrays.toString(insertionSort(numbers)));
    }
    public static int[] bubbleSort(int[] numbers){
        int length = numbers.length;
        for(int i = 0; i < length - 1; i++){
            for(int j = 0; j < length - i - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] selectionSort(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            int min = i;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[min]){
                    min = j;
                }
            }
            if(numbers[min] < numbers[i]){
                int temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;

            }
        }
        return numbers;
    }

    public static int[] insertionSort(int[] numbers){
        for(int i = 1; i < numbers.length; i++){
            int insert = numbers[i];
            int j = i - 1;
            while(j >= 0 && insert < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = insert;
        }
        return numbers;
    }
}
