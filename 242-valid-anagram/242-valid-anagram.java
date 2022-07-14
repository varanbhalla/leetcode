class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) 
            return false;
        
        int[] found = new int[26];
        
        for (int i = 0; i < sLength; i++) {
            char ch = s.charAt(i);
            found[ch - 'a'] ++; // increament by 1
        }
        
        for (int i = 0; i < tLength; i++) {
            char ch = t.charAt(i);
            found[ch - 'a'] --; // decreament by 1
            if (found[ch - 'a'] < 0) {
                return false;
            }
        }
        
        for (int element: found) {
            if (element != 0) {
                return false; // not an anagram
            }
        }
        return true; // anagram found
    }
}

// Time:  O(n)
// Space: O(1)

