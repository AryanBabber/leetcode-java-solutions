import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> tm = new HashMap<>();
		tm.put('M', 1000);
		tm.put('D', 500);
		tm.put('C', 100);
		tm.put('L', 50);
		tm.put('X', 10);
		tm.put('V', 5);
		tm.put('I', 1);
		
		int len = s.length();
		int num = tm.get(s.charAt(len - 1));
		
		for (int i = len - 2; i >= 0; i--) {
			if(tm.get(s.charAt(i)) < tm.get(s.charAt(i + 1))) {
				num -= tm.get(s.charAt(i));
			} else {
				num += tm.get(s.charAt(i));
			}
		}
		return num;
    }
}