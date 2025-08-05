import java.util.*;

public class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();

        List<Character>[] rows = new List[numRows];
        int k = 0;
        int dir = numRows == 1 ? 0 : -1;

        for (int i = 0; i < numRows; ++i)
            rows[i] = new ArrayList<>();

        for (char c : s.toCharArray()) {
            rows[k].add(c);
            if (k == 0 || k == numRows - 1) {
                dir *= -1;
            }
            k += dir;
        }

        for (List<Character> r : rows) {
            for (char c : r)
                sb.append(c);
        }

        return sb.toString();
    }
}