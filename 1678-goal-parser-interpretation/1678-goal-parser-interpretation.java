class Solution {
    
    private boolean isLastCharOfString(int start, int end) {
        return start == end;
    }
    
    public String interpret(String command) {
        StringBuilder parserSB = new StringBuilder();
        int commandLength = command.length();
        for (int i = 0; i < commandLength; i++) {
            int currentChar = command.charAt(i);
            int nextChar = (isLastCharOfString(i, commandLength-1) ? currentChar : command.charAt(i+1));
            
            if (currentChar == '(' && nextChar == ')') {
                parserSB.append('o');
                i += 1;
            } else if (currentChar == '(' && nextChar == 'a') {
                parserSB.append("al");
                i += 3;
            } else {
                parserSB.append('G');
            }
        }
        return new String(parserSB);
    }
}