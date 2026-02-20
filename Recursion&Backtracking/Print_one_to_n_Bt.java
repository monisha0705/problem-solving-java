public class fromonetonusingbt {
    public static void main(String[] args) {
        btofoneton(3,3);
    }
    public static void btofoneton(int count,int n){
        if (count<1)
            return;

        btofoneton(count-1,n);
        System.out.println(count);
    }
}
