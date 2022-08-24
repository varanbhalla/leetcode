class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalCount = 0;
        for (String operation: operations) {
            char middleChar = operation.charAt(1);
            if (middleChar == '+') 
                finalCount ++;
            else 
                finalCount --;
        }
        return finalCount;
    }
}