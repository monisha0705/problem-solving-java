import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num =n;
        int digits = String.valueOf(n).length();
        while(n!=0){
            int rev= n%10;
            sum =(int) (sum+Math.pow(rev,digits));
            n=n/10;
        }
        if(num==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
