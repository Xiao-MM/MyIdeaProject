package com.ming.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,7,1,4,2,5,9,5};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        int length = arr.length;
        buildHeap(arr, length);
        for (int i = length-1; i >=0; i--){
            swap(arr,0, i);
            length--;
            adjust(arr,0,length);
        }
    }

    public static void buildHeap(int[] arr, int length){
        for (int i = (int) Math.floor(length/2); i>=0; i--){
            adjust(arr,i,length);
        }
    }

    public static void adjust(int[] arr, int i, int length){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if (left < length && arr[left] > arr[max]){
            max = left;
        }
        if (right < length && arr[right] > arr[max]){
            max = right;
        }
        if (i != max){
            swap(arr, max, i);
            adjust(arr,max,length);
        }
    }

    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
