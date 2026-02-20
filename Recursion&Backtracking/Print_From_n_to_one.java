public class recursionofn {
    public static void main(String[] args) {
        printfromoneton(1,4);
    }

    public static void printfromoneton(int current,int n){
        if(current>n) return;

        System.out.println(current);
        printfromoneton(current+1,n);
    }
}
