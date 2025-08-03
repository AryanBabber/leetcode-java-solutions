public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int[] strLen = new int[128];
        
        for(int i = 0, j = 0; j < s.length(); ++j) {
            ++strLen[s.charAt(j)];
            while(strLen[s.charAt(j)] > 1) {
                --strLen[s.charAt(i++)];
            }
            count = Math.max(count, j - i + 1);
        }

        return count;
    }
}