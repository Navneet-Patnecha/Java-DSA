package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,3,8,9};
        //int[] ans = mergerSort(arr);
        //System.out.println(Arrays.toString(ans));
        mergeSortInplace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] mergerSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergerSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
        
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i =0 ;
        int j = 0;
        int k = 0;
        while(i< left.length && j < right.length){
            if(left[i] <= right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // it may be possibble that array is not complete
        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void mergeSortInplace(int[] arr , int s , int e){
        if ( e-s ==1){
            return;
        }
        int mid = (s+e)/2;


        mergeSortInplace(arr ,s , mid);
        mergeSortInplace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int[] arr , int s , int mid , int e) {
        int[] mix = new int[e-s];
        int i =s ;
        int j = mid;
        int k = 0;
        while(i< mid && j < e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possibble that array is not complete
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l =0 ; l < mix.length ;l++)
        {
            arr[s+l] = mix[l];
        }
    }

}
