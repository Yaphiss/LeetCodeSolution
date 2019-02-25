class Solution {
    public int[] solution (int[] arr) {
        int[] newArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            newArr[i] = (int)Math.pow(A[i], 2);
        }
        Arrays.sort(newArr);
        return newArr;
    }
}