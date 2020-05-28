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
****
方法二：两遍哈希

```java
class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            throw new IllegalArgumentException("No such two sum solution");
        }
    }

```
思考：
1.空间换时间，正如网友所说”为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。如果存在，我们需要找出它的索引。保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。“

2.学习了HashMap，这一次主要学得HashMap的用法，键值对，put()，get()，虽然还是忍不住看了一遍底层实现原理

****
