class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        while (num > 0) {
            int reminder = num % 10;
            digits[i] = reminder;
            i++;
            num /= 10;
        }
        Arrays.sort(digits);
        int min = digits[0];
        int secondMin = digits[1];
        int thirdMin = digits[2];
        int forthMin = digits[3];
        int firstMinPair = min * 10 + thirdMin;
        int secondMinPair = secondMin * 10 + forthMin;
        int minSum = firstMinPair + secondMinPair;
        return minSum;
    }
}