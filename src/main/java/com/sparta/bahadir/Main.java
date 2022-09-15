package com.sparta.bahadir;

import com.sparta.bahadir.Controller.BinarySort;
import com.sparta.bahadir.Controller.MergeSort;
import com.sparta.bahadir.Controller.bubbleSort;

import java.util.Arrays;

import static com.sparta.bahadir.utilsMethods.arrayGenerator;
import static com.sparta.bahadir.utilsMethods.merger;

public class Main {
    public static void main(String[] args) {

        bubbleSort bubbleSort = new bubbleSort();
        MergeSort mergeSort = new MergeSort();
        BinarySort binarySort = new BinarySort();
        utilsMethods util = new utilsMethods();

        int[] array1 = arrayGenerator(1000,1000);
        int[] array2 = arrayGenerator(6,100);


        System.out.println(Arrays.toString(bubbleSort.sortArray(merger(array1,array2))));




        //System.out.println(Arrays.toString(mergeSort.sortArray(merger(array1,array2))));
       // System.out.println(Arrays.toString(binarySort.sortArray(merger(array1,array2))));

    }


}
