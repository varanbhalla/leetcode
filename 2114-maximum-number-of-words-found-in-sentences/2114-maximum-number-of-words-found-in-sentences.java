class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxSentenceCount = 0, currentSentenceCount = 0;
        for (String sentence: sentences) {
            currentSentenceCount = sentence.split(" ").length;
            maxSentenceCount = Math.max(currentSentenceCount, maxSentenceCount);
        }
        return maxSentenceCount;
    }
}