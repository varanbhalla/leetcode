class Solution {
    public String interpret(String command) {
        StringBuilder parserSB = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char currentChar = command.charAt(i);
            char nextChar = (i == command.length() -1) ? command.charAt(i) : command.charAt(i+1);
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
        return parserSB.toString();
    }
}