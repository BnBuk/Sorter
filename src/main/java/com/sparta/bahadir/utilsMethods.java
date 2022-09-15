package com.sparta.bahadir;

import java.util.Arrays;
import java.util.Random;

public class utilsMethods {

    /**
     * This method is merges two int arrays regardless of the size
     * and returns sorted ascending order int array without duplicates values...
     */
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
        return results;
    }

    /**
     * This method creates int array with random values.
     * Size and bound are selectable via passing parameters in method
     * and returns int array.
     */

    public static int[] arrayGenerator(int size,int limit){

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){

            array[i] = random.nextInt(limit);
        }

        return array;
    }

    /**
    *
    *
    */

//    public static boolean assertThis(String actual, String expected){
//
//        Assertions.assertEquals();
//
//        return
//    }


}
