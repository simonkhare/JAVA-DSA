class Solution {
    public void reverseString(char[] s) {
        int l = s.length-1;
        char c;
        for(int i = 0 ; i <= s.length/2 ; i++){
            c = s[i];
            s[i] = s[l];
            s[l] = c;
            l--;
        }
    }
}