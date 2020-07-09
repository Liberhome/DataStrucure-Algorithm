方法一：双重循环暴力求解O(n平方)
```java
public class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
```
方法二：O（n）
```java
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            //另外 当前价格大于minprice时：
            else if(prices[i]-minPrice > result){
                result = prices[i]-minPrice;
            }
        }
        return result;
    }
}
```
