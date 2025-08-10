import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> dq = new Stack<>();

        for (final char c : s.toCharArray()) {
            if (c == '(')
                dq.push(')');
            else if (c == '{')
                dq.push('}');
            else if (c == '[')
                dq.push(']');
            else if (dq.isEmpty() || dq.pop() != c)
                return false;
        }

        return dq.isEmpty();
    }
}