package com.sparta.bahadir;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.*;

public class TestMain {

    bubbleSort bubbleSort = new bubbleSort();
    MergeSort mergeSort = new MergeSort();
    BinarySort binarySort = new BinarySort();
    Map map = new HashMap();

    int[] duplicated = {98, 24, 18, 67, 29, 98, 0, 35, 35};


    @Test
    @DisplayName("Negative Test")
    public void isDuplicate() {

    int expResult, actResult;
    int[] arr = bubbleSort.sortArray(duplicated);
    //List<AssertionError> errorS = new ArrayList<AssertionError>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == (arr[j])) {

                    try {
                        Assert.assertNotEquals(arr[i], arr[j]);
                    }catch(AssertionError e){
                        //System.out.println(errorS.add(e));
                        System.out.println(arr[i]);
                    }
                };


            }
        }
    }
}