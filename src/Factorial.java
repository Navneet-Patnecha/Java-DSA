public class Factorial {
    public static void main(String[] args) {
        System.out.println(product(6));
        System.out.println(sum(5));

    }

    public static int sum(int i) {
        if(i == 1){
            return 1;
        }
        int ans = i + sum(i-1);
        return ans;

    }

    public static int product(int n ){
        if( n == 1){
            return 1;
        }
        return n*product(n-1);

    }
}
