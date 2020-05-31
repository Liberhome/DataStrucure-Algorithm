### 解题思路
不要忘记考虑两头的特殊情况哟~

### 代码

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int p = 0;
            int q = 1;
            if (nums == null || nums.length == 0) throw new IllegalArgumentException("No such two sum solution ");
            if (nums[0] == target) {
                return 0;
            }
            if(nums[0] > target) return 0;
            while (q < nums.length) {
                if (nums[q] == target) {
                    return q;
                }
                if (nums[p] < target && nums[q] > target) {
                    return q;
                }
                p++;
                q++;
            }
            return q;
    }
}
```
