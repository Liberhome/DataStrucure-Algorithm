
首先得到数组A，B的长度m,n
建立一个新的数组c ，长度为m+n
初始化i,j,k为0
只要满足I<m;j<n;k<m+n就进入循环
	当前数组c中的元素始终当前取数组A，B中最小的那个（也就是merge）
循环结束

如果数组A的元素都加入到C里面去了，直接把B剩下的元素接到C里面去
如果数组B的元素都加入到C里面去了，直接把A剩下的元素接到C里面去

如果是奇数，返回一个中位数；否则返回中间两个中位数

```java
import java.util.*;


public class Solution {
    /**
     * 
     * @param A int整型一维数组 
     * @param B int整型一维数组 
     * @return double浮点型
     */
    public double findMedianSortedArrays (int[] A, int[] B) {
       

        int m = A.length,n = B.length;
        int[] c = new int[m+n];
        int i = 0,j = 0,k = 0;
        for(;i < m && j < n && k < m+n;k++){
            if(A[i] < B[j]) c[k] = A[i++];
            else c[k] = B[j++];
        }
        while(k < m+n && j < n) c[k++] = B[j++];
        while(k < m+n && i < m) c[k++] = A[i++];
        if((m+n)%2 == 1) return (double)c[(m+n)/2];
        else return (double)(c[(m+n)/2 - 1] + c[(m+n)/2]) / 2.0;
    }
}
```
 
