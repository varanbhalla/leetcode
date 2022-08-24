class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defangedSB = new StringBuilder();
        for (char ch: address.toCharArray()) {
            if (ch == '.') {
                defangedSB.append("[.]");
            } else {
                defangedSB.append(ch);
            }
        }
        return defangedSB.toString();
    }
}