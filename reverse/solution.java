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
}