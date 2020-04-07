经典的冒泡其实也有可以关注的点
就是双重循环
外面那一重定义循环的趟数
-1因为从0开始计数
里面那层得-i-1
因为i趟之后
我们可以保证已经有i个数字正序了

```java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 9};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
```
