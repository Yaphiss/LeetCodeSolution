class Solution {
    public String solution (String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return arr2sString(strs);
        String pref = "";
        for (int i = 0; i < strs.length; i++) {
            String temp = "";
            String current = strs[i];
            int len = pref.length() > 0 ? pref.length() : current.length();
            if (i != strs.length - 1 && i == 0) {
                String next = strs[i + 1];
                len = Math.min(len, next.length());
                for (int j = 0; j < len; j++) {
                    if (current.charAt(j) == next.charAt(j)) {
                        pref += current.charAt(j);
                    }
                }
            }
            if (i != 0) {
                if (pref.length() == 0) return pref;
                String next = strs[i];
                len = Math.min(len, next.length());
                // System.out.println("pref: " + pref + "; len: " + pref.length());
                // System.out.println("next: " + next + "; len: " + next.length());
                for (int j = 0; j < len; j++) {
                    if (pref.charAt(j) == next.charAt(j)) {
                        temp += pref.charAt(j);
                    } else {
                        break;
                    }
                }
                pref = temp;
            }
        }
        return pref;
    }

    public String arr2sString (String[] strs) {
        StringBuffer buffer = new StringBuffer();
        for (String item : strs) {
            buffer = buffer.append(item);
        }
        return buffer.toString();
    }

    public String solution2 (String[] strs) {
        // 数组长度
        int len = strs.length;
        // 用于保存结果
        StringBuffer res = new StringBuffer();
        // 注意：=是赋值，==是判断
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else
                break;

        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"a"};
        String result = new Solution().solution(strs);
        System.out.println("result: " + result);
    }
}