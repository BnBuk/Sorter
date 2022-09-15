package com.sparta.bahadir.Controller;

import java.util.Date;

public class bubbleSort implements Sorter {

    public int[] sortArray(int[] array) {

        long start = new Date().getTime();
        int a = array.length;

        for (int i=0;i<a-1;++i){
            for(int j=0;j<a-i-1; ++j){
                if(array[j+1]<array[j]){
                    int flag = array[j];

                    array[j] = array[j+1];
                    array[j+1] = flag;

                }
            }
        }
        long finish = new Date().getTime();
        System.out.println((finish-start) + "ms" + " has been passed with bubble sorting method...");
        return array;
    }
}
