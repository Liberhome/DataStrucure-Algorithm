### 解题思路
我觉得还是要细细体会 这个题目的含义 ，题目要求就地删除，所以，就是需要使用覆盖的方法来把指定元素删掉

### 代码

```java
class Solution {
    public int removeElement(int[] nums, int val) {
       if (nums==null||nums.length==0)return 0;
        int p=0;
        int q=0;
        while (q<nums.length){
            if (nums[q]!=val){
                nums[p]=nums[q];
                p++;
            }
            
            q++;
        }
        return p;
    }
}
```
