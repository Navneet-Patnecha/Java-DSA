import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n ){

        if(n < 2){
            return n;
        }
        int ans = fibo(n-1)+fibo(n-2);
        return ans;

    }

}
