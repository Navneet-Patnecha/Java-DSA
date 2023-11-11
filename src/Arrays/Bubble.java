package Arrays;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,67,6};
        bubble_sort(arr , arr.length-1 , 0);
        System.out.println(Arrays.toString(arr));


    }
    public static void bubble_sort(int[] arr , int r , int index){
        //number of time we are doing checking
        if (r == 0 ){
            return;
        }
        if (index < r){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;


            }
            bubble_sort(arr , r , index+1);

        }
        else{
            bubble_sort(arr, r-1 , 0);
        }
    }
}
