class Solution {
    public int divide(long dividend, long divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
        long ans = 0;
        long div = Math.abs(dividend);
        long divs = Math.abs(divisor);

        while(div >= divs) {
            long k = 1;
            while(k * 2 * divs <= div) {
                k *= 2;
            }
            div -= k * divs;
            ans += k;
        }

        return sign * (int) ans;
    }
}