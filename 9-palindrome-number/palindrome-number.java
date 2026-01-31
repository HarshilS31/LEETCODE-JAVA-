class Solution {
    // By Harshil
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        int rev = 0;
        int xc = x;
        

        while (x > 0) {
            rev = (rev*10) + (x%10);
            x /= 10;
        }

        return rev==xc;        
    }
}