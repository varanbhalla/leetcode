class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxSentenceCount = 0;
        int currentSentenceCount = 0;
        for (String sentence: sentences) {
            currentSentenceCount = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    currentSentenceCount ++;
                } 
            }
            maxSentenceCount = Math.max(maxSentenceCount, currentSentenceCount);
        }
        return maxSentenceCount;
    }
}