两数之和

方法一：暴力枚举

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No such two sum solution ");
    }
}

```
思考：

1.这里要注意 i < nums.length 因为i从0开始 遍历到最后一个元素结束 所以刚好

2.像这种OJ题目如果没有返回可以这样写： throw new IllegalArgumentException("********");
