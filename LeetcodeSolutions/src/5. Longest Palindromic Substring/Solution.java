public class Solution {
    public String longestPalindrome(String s) {
        if (s.isEmpty())
            return "";

        int[] ind = { 0, 0 };
        for (int i = 0; i < s.length(); ++i) {
            int[] ind1 = e(s, i, i);
            if (ind1[1] - ind1[0] > ind[1] - ind[0])
                ind = ind1;
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                int[] ind2 = e(s, i, i + 1);
                if (ind2[1] - ind2[0] > ind[1] - ind[0])
                    ind = ind2;
            }
        }

        return s.substring(ind[0], ind[1] + 1);
    }

    private int[] e(final String s, int i, int j) {
        for (; i >= 0 && j < s.length(); --i, ++j) {
            if (s.charAt(i) != s.charAt(j))
                break;
        }
        return new int[] { i + 1, j - 1 };
    }
}