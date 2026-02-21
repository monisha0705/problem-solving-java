import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factusingpar(num,1);
        System.out.println(factusingfun(num));
    }
    //parametrized way
    public static void factusingpar(int n, int mul){
        if(n==0){
            System.out.println(mul);
            return;
        }
        factusingpar(n-1,mul*n);
    }

    //functional way
    public static int factusingfun(int n){
        if(n==0){

            return 1;
        }
        return n*factusingfun(n-1);
    }
}
