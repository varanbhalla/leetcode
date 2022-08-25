class Solution {
    public int subtractProductAndSum(int num) {
        int productOfNum = 1;
        int sumOfNum = 0;
        int differenceOfProductAndSum = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            productOfNum *= lastDigit;
            sumOfNum += lastDigit;
            num /= 10;
        }
        differenceOfProductAndSum = productOfNum - sumOfNum;
        return differenceOfProductAndSum;
    }
}