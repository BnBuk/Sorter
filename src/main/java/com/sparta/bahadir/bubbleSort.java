package com.sparta.bahadir;

public class bubbleSort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {

        int a = arrayToSort.length;

        for (int i=0;i<a-1;++i){

            for(int j=0;j<a-i-1; ++j){

                if(arrayToSort[j+1]<arrayToSort[j]){

                    int flag = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = flag;

                }
            }
        }
        return arrayToSort;
    }
}
