class Solution {
    public int solution (int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = Math.abs(x);
        }
        StringBuffer buffer = new StringBuffer();
        String reverse = buffer.append(x).reverse() + "";
        int result = Integer.valueOf(reverse);
        return flag ? result : result * -1;
    }

    public int solution2 (int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            if (n > Integer.MAX_VALUE) return 0;
            if (n < Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int)n;
    }
}