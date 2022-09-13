package com.sparta.bahadir;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


class Task2Test {

    bubbleSort bubbleSort = new bubbleSort();
    MergeSort mergeSort = new MergeSort();
    BinarySort binarySort = new BinarySort();


    int[] duplicated = {98, 24, 18, 67, 29, 98, 0, 35, 35};


    @Test
    @DisplayName("Duplicate")
    public void boundryTest() {


        int[] arr = bubbleSort.sortArray(duplicated);
        System.out.println(arr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (arr[j])) { // got the duplicate element } } }

                }
            }
        }


    }
}