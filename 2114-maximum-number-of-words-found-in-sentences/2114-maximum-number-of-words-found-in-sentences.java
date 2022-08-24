class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxSentenceCount = 0;
        int currentSentenceCount = 0;
        for (String sentence: sentences) {
            currentSentenceCount = sentence.split(" ").length;
            maxSentenceCount = Math.max(maxSentenceCount, currentSentenceCount);
        }
        return maxSentenceCount;
    }
}