class Solution {
    public void reverseString(char[] str) {
        int left = 0;
        int right = str.length-1;
        char temp;
        
        while (left < right) {
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left ++;
            right --;
        }
    }
}

// Time:  O(n)
// Space: O(1)