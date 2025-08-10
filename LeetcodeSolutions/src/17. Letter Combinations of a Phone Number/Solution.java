import java.util.*;

public class Solution {
    private final String[] mobile = {"",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> letterCombinations(String digits) {
		List<String> a = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		
		if(digits.isEmpty()) return new ArrayList<>();
		
		dfs(digits, 0, s, a);
		return a;
	}
	
	public void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
		if(i == digits.length()) {
			ans.add(sb.toString());
			return;
		}
		
		for(char c : mobile[digits.charAt(i) - '0'].toCharArray()) {
			sb.append(c);
			dfs(digits, i + 1, sb, ans);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}