package com.sparta.bahadir;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        bubbleSort bubbleSort = new bubbleSort();
        MergeSort mergeSort = new MergeSort();
        BinarySort binarySort = new BinarySort();

        int[] array1 = new int[10];
        //int[] array1 ={61, 10, 66, 56, 66, 68, 16, 3, 27, 52};
        int[] array2 = new int[6];
        //int[] array2 = {76, 26, 30, 52, 32, 24};


        for (int i = 0; i < array1.length; i++){array1[i] = random.nextInt(100);}
        for (int i = 0; i < array2.length; i++){array2[i] = random.nextInt(100);}
        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(bubbleSort.sortArray(merger(array1,array2))));
        //System.out.println(merger(array1,array2));
        System.out.println(Arrays.toString(mergeSort.sortArray(merger(array1,array2))));
        System.out.println(Arrays.toString(binarySort.sortArray(merger(array1,array2))));

    }

    public static int[] merger(int[] a, int[] b) {

        int totalLength = a.length + b.length;
        int[] mergedArray = new int[totalLength];

        int[] results = new int[0];
        for (int i = 0; i < totalLength; i++) {

            if (i < a.length) {
                mergedArray[i] = a[i];
            } else if ((i) < totalLength) {
                mergedArray[i] = b[i - a.length];
            }
        }
         results = Arrays.stream(mergedArray).distinct().toArray();
       // return Arrays.stream(mergedArray).distinct().toArray();
        return results;
    }
}
