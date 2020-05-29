26. 删除排序数组中的重复项

方法一：

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int p=0;
        int q=1;
        while (q<nums.length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
        
    }
}

```
思考：

1.原地算法其实就是耗费的额外空间为常数.
****
