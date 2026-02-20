public class fromntooneusingbt {
    public static void main(String[] args) {
        ntonebt(1,3);
    }

    public static void ntonebt(int count,int n){
        if(count>n)
            return;
        ntonebt(count+1,n);
        System.out.println(count);
    }
}
