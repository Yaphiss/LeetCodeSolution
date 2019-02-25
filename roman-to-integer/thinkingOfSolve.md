### 解题思路

> 在本题目当中，
I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

- 方案一：
    - 构建罗马数字映射表。
    - 将输入的罗马字符串转换成数组进行遍历。
    - 将每次遍历出来的结果与上一次的进行比较，如果是大于上次的，需要减去上次的结果*2，然后再加上本次的。
    - 得出最终结果。

> `方案一中的第三步，为什么需要减去上次的结果*2；原因是按照题意，小的罗马数字只能是放在大的右边，假若出现小的在大的右边，那么需要将这两者结合起来，例如4用罗马数字表示为IV，6表示为VI；显而易见，我们在遍历的时候对小的进行重复计算两次，因此才需要减去上次结果*2`
> 目前只想到这两种解决方式，后续有其他更好的算法会加入进来；