class Solution {
    public boolean isPalindrome(int num) {
        if (num == 0)
            return true;
        if (num < 0)
            return false;
        if (num % 10 == 0) 
            return false;
        
        int reversed = 0;
        int numCopy = num;
        int remainder;
        while (num > 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        } // logic for reversing a number
        
        if (numCopy == reversed) {
            return true;
        } 
        return false;
    }
}