public class Solution {
    public boolean palindromeNumber (int x) {
        if (x < 0) return false;
        int origin = x;
        long num = 0;
        while(x > 0){
            num = num * 10 + num % 10;
            num /= 10;
        }
        return origin == num;
    }
}