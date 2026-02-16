class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int firstNum=0;
        int secondNum=1;
        int currentNum=0;
        for(int i = 2;i<=n;i++){
            currentNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=currentNum;
        }
        return secondNum;
    }
}
