一拿到题马上条件反射到斐波那契数列
手动写出了
```java
class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n - 1)+climbStairs(n - 2);
    }
}
```
。。。不愧是我系列

咦，为啥运行超时了QAQ~~~
话说。。可不可以简单分析一下复杂度：空间O(n),时间O(2^n)
话说。。O(2^n)有点。。。好吧。。懂了
改进之后：
```java
class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q; 
            q = r; 
            r = p + q;
        }
        return r;
    }
}
```
