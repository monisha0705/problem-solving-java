class Solution {
    public boolean isPalindrome(int x) {
       if(x<0 || (x%10 == 0 && x!=0 )){
            return false;
       }
        int sum=0;
        int num = x;
        while(x>0){
            int rev = x%10;
            sum=sum*10+rev;
            x=x/10;
         }
         if(sum==num){
            return true;
        }
        else{
            return false;
        }
   }
}
