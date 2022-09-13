package com.sparta.bahadir;

public class BinarySort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int n = arrayToSort.length;
        int i, loc, j, k, selected;

        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = arrayToSort[i];

            // find location where selected should be inserted
            loc = binarySearch(arrayToSort, selected, 0, j);

            // Move all elements after location to create space
            while (j >= loc) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = selected;
        }
        return arrayToSort;
    }

    static int binarySearch(int a[], int item, int low, int high)
    {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == a[mid])
                return mid + 1;
            else if (item > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

}





/*
    static int binarySearch(int a[], int item, int low, int high)
    {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == a[mid])
                return mid + 1;
            else if (item > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    // Function to sort an array a[] of size 'n'
    static void insertionSort(int a[], int n)
    {
        int i, loc, j, k, selected;

        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = a[i];

            // find location where selected should be inseretd
            loc = binarySearch(a, selected, 0, j);

            // Move all elements after location to create space
            while (j >= loc) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = selected;
        }

*/