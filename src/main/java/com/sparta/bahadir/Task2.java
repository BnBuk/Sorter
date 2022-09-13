package com.sparta.bahadir;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {


        Random random = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[6];

        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(100);
        }

        for (int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        //System.out.println(merger(array1, array2));
        //System.out.println(bubbleSort.sortArray(merger(array1,array2)));


    }

    public static int[] merger(int[] a, int[] b){

        int totalLength = a.length + b.length;
        int[] mergedArray = new int[totalLength];

        for (int i = 0; i < totalLength; i++) {

            if (i<a.length) {
                mergedArray[i] = a[i];
            }else if ((i)<totalLength) {
                mergedArray[i] = b[i-a.length];
            }


        }

        return mergedArray;
    }


}
