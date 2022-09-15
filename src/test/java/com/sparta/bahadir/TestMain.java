package com.sparta.bahadir;

import com.sparta.bahadir.Controller.BinarySort;
import com.sparta.bahadir.Controller.MergeSort;
import com.sparta.bahadir.Controller.bubbleSort;
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
        List<AssertionError> errorS = new ArrayList<AssertionError>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (arr[j])) {
                    Assert.assertEquals(arr[i], arr[j]);
                    System.out.print(arr[i] + "\t");
                }
            }
        }
    }
}
