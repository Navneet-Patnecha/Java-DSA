public class CountSteps {
    public static void main(String[] args) {
        System.out.println(steps(123));

    }
    public static int steps(int n ){
        int count = 0;
        return helper(n , count);
    }

    private static int helper(int n, int count) {
        if(n == 0){
            return count;
        }
        if(n%2 == 0){
            return helper(n/2 ,count+1);
        }
        else{
            return helper(n-1,count+1);
        }
    }
}
