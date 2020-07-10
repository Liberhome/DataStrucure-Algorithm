相较于121 这个就更简单了 只要有利润就做
```java
class Solution {
    public int maxProfit(int[] prices) {
        int myProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i]-prices[i-1]>0){
                myProfit+=prices[i]-prices[i-1];
            }
        }
        return myProfit;
    }
}
```
