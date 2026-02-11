public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        while(N>0){
            int rev = N%10;
            count++;
            N=N/10;
        }
        System.out.println(count);
    }
}
