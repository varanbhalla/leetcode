class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        while (num > 0) {
            int reminder = num % 10;
            digits[i] = reminder;
            num /= 10;
            i++;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        int forthMin = Integer.MAX_VALUE;
        for (int digit: digits) {
            if (digit < min) {
                forthMin = thirdMin;
                thirdMin = secondMin;
                secondMin = min;
                min = digit;
            } else if (digit < secondMin) {
                forthMin = thirdMin;
                thirdMin = secondMin;
                secondMin = digit;
            } else if (digit < thirdMin) {
                forthMin = thirdMin;
                thirdMin = digit;
            } else if (digit < forthMin) {
                forthMin = digit;
            }
        }
        
        int firstMinPair = Integer.parseInt(Integer.toString(min) + Integer.toString(thirdMin));
        int secondMinPair = Integer.parseInt(Integer.toString(secondMin) + Integer.toString(forthMin));
        int minSum = firstMinPair + secondMinPair;
        return minSum;
    }
}