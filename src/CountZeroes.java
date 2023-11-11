public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(302002 , 0));

    }
    public static int count(int n , int flag){
        if(n == 0){
            return flag;
        }
        int rem = n%10;
        if(rem == 0){
            return count(n/10, flag +1);
        }
        else{
            return count(n/10,flag);
        }

    }
}
