public class Message {
    public static void main(String[] args) {

//        print 1 to n using recursion
        number(1);

    }
    public static void number(int n ){
        if(n == 5){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);

            //this is tail recursion , because we are having last function call
            number(n+1);
        }

    }
}
