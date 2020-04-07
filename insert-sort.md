实际上 和 前一篇bubble sort 差别并不是很大
第一趟循环一毛一样，保证全部走一趟
第二趟循环和bubble sort 刚好相反，bubble sort 是从第一个开始向最后一个走，insert-sort则是从当前最后一个向第一个走
不过时间复杂度都是一样的：n^2

```java
public class InsertSort {
    public static void main(String[] args) {
        int[] ins={24,9,7,11,43,5,89,31};
        int[] ins1=sort(ins);
        for (int in :
                ins1) {
            System.out.println(in);
        }
    }
    
    public static int[] sort(int[] ins){
        for (int i = 1; i < ins.length; i++) {
            for (int j = i; j >0; j--) {
                if (ins[j]<ins[j-1]){
                    int temp = ins[j-1];
                    ins[j-1] = ins[j];
                    ins[j] = temp;
                }
            }
        }
        return ins;
    }
}
```
