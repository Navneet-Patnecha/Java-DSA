public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,22,44,67,564};
        int target = 22;
        int index = search(arr ,target , 0 , arr.length -1 );
        System.out.println(index);
    }

    public static int search(int[] arr , int target , int start , int end){
        if(start > end){
            return - 1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid ] == target){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr , target ,start , mid - 1);
        }
        return search(arr , target , mid+1 , end);
    }
}
