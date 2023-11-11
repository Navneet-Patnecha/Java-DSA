
public class Palindrom {
    public static void main(String[] args) {
        int n = 1331;
        int ans = rev2(n);
        if(ans == n){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    public static int rev2(int n){
//        sometime you might need additional variable to solve the answer in the arguement
        int digits = (int)(Math.log10(n) + 1 );
        return helper(n , digits);

    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n ;
        }
        int rem = n%10;
        return (int) (rem * (Math.pow(10, digits-1) )+ helper(n/10 ,digits-1));
    }
}
