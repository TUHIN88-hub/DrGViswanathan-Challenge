class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);

        int open = 0;

        // Remove invalid closing brackets
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                } else {
                    sb.setCharAt(i, '#');
                }
            }
        }

        // Remove extra opening brackets from right to left
        for (int i = sb.length() - 1; i >= 0 && open > 0; i--) {
            if (sb.charAt(i) == '(') {
                sb.setCharAt(i, '#');
                open--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '#') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }
}
