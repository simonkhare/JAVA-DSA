class Solution {
    public boolean isPalindrome(int x) {
        if(x=>0){
            int reverse = 0;
            int temp = x ;
            while(x>0){
                reverse = reverse*10 + x%10 ;
                x /= 10;
            }
            if(temp == reverse){
                return true;
            }
            return false;
        }
        return false;
    }
}