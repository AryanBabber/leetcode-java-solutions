public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return sb.toString();
        }

        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }

        for (int i = 0; i < minLen; i++) {
            char curr = strs[0].charAt(i);
            for (String str : strs) {
                if (curr != str.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}