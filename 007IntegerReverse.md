```java
class Solution {
    public int reverse(int x) {
        //思路就是每次通过取模得到最后一个数然后顺序输出
        int answer = 0;
        while(x!=0){
            //得到最后一个数
            int temp = x%10;
            //输入是按要求来的，但是输出可能溢出
            if(answer>214748364 || (answer==214748364 && temp>7)){
                return 0;
            }
            if(answer<-214748364 || (answer==-214748364 && temp<-8)){
                return 0;
            }
            //得到这一轮答案
            answer = answer*10 + temp;
            //x➗10进入下一个while
            x /= 10;
        }
        return answer;
    }
}
```
