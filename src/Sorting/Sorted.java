package Sorting;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,61,7,8};
        System.out.println(sorted(arr,0));

    }
    public static boolean sorted(int[] arr , int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);

    }
}
