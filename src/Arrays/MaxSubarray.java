package Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long ans = subArray(arr);
        System.out.println("the maximum sum of sub-array is" +ans);

    }
    public static long subArray(int[] arr){
        long maxi = Long.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart =-1;
        int ansEnd = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if ( sum == 0 ){
                start = i;
            }
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0){
                sum = 0;
            }

        }
        System.out.print("[");
        for(int i = ansStart ; i<= ansEnd ;i++){

            System.out.print(arr[i]  + " ");

        }
        System.out.print("]");
        return maxi;

    }
}
