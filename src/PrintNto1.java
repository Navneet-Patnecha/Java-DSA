public class PrintNto1 {
    public static void main(String[] args) {
        printRev(5);

    }
    public static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void printRev(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        printRev(n - 1);
        System.out.println(n);
    }
}
