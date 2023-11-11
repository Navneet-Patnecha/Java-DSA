package Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,6,7,78,65 , 7 };
//        int target = 78;
//        System.out.println(searchIndex(arr,target,0));
//        System.out.println(search(arr,21,0));
//        findAll(arr,3,0);
//        System.out.println(list);
        ArrayList<Integer> ans = find_index2(arr ,7 , 0 );
        System.out.println(ans);
    }
    public static boolean search(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);

    }
    public static int searchIndex(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchIndex(arr,target , index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAll(int[] arr , int target , int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAll(arr,target,index+1);
    }

    //returning Arraylist
    public static ArrayList find_index(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find_index(arr  ,target,index+1 , list);
    }
    // Without arguement , but passsing list in above function calls
    public static ArrayList<Integer> find_index2(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            //this list will store for this function call only
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = find_index2(arr , target , index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
