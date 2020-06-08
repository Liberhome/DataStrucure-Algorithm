### 解题思路
贪心关键”如果前面总和>0 就留下所有 否则丢掉前面 仅保留当下“
虽然感觉有点马后炮，不过这种本来就是需要积累的，这将为以后解决这一类问题提供思路


### 代码

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=nums[0];
        for(int num:nums){
            if(sum>0){
                sum+=num;
            }else{
                sum=num;
            }
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
```
