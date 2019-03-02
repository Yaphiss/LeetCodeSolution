import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public static void solution (int[] a, int low, int high) {
        int start = low;
         int end = high;
         int key = a[low];
         
         while(end>start){
             //从后往前比较
             //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
             while(end>start&&a[end]>=key) {
                end--;
             }
             if(a[end]<=key){
                 int temp = a[end];
                 a[end] = a[start];
                 a[start] = temp;
             }
             //从前往后比较
             //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
             while(end>start&&a[start]<=key){
                start++;
             }
             if(a[start]>=key){
                 int temp = a[start];
                 a[start] = a[end];
                 a[end] = temp;
             }
         //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
         }
         //递归
         if(start>low) solution(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
         if(end<high) solution(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }

    private int[] concatenate(int[] a, int[] b, int[] c){
        int len = 0;
        len += a != null ? a.length : 0;
        len += b != null ? b.length : 0;
        len += c != null ? c.length : 0;
        int[] n = new int[len];
        if (null != a) System.arraycopy(a, 0, n, 0, a.length);
        if (null != b) System.arraycopy(b, 0, n, a.length, b.length);
        if (null != c) System.arraycopy(c, 0, n, a.length + b.length, c.length);
        System.out.println("concatenate: "+ Arrays.toString(n));
        return n;
    }

    private int[] add (int[] array, int target) {
        int[] newArr = new int[array.length + 1];
        System.arraycopy(array, 0, newArr, 0, array.length);
        newArr[newArr.length - 1] = target;
        // System.out.println("add: "+ Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4,6,5,7,9};
        solution(nums, 0, nums.length -1);
        System.out.println(Arrays.toString(nums));


        // int[] arr = new int[]{1,2,3};
        // int[] result = new Solution().add(arr, 4);
        // System.out.println(Arrays.toString(result));

        // int[] arr1 = new int[]{1,2,3};
        // int[] arr2 = new int[]{4,5};
        // int[] result = new Solution().concatenate(arr1, arr2, null);
    }
}