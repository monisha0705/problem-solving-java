public class sumofnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       System.out.println(sumofnumbersfun(n));
    }

    //parameterizedway
    public static void sumofnumbers(int i ,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumofnumbers(i-1,sum+i);

    }
    //functionalway
    public static int sumofnumbersfun(int num){
        if(num<1){
            return 0;
        }
       return num+sumofnumbersfun(num-1) ;
    }
}
