public class printnamentimez {
    public static void main(String[] args) {
        printname("Monisha",0,4);
    }
    public static void printname(String name,int count,int n){
        if(count==n)
            return;

        System.out.println(name);

        printname(name,count+1,n);
    }

}
