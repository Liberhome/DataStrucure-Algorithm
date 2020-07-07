```java
package day01;
import java.util.HashSet;

public class Solution {
    public void setZeros(int[][] matrix){
        //创建两个集合分别保存要重置为0的行与列
        HashSet<Integer> row =new HashSet<>();
        HashSet<Integer> col =new HashSet<>();
        //遍历matrix，如果找到某数为0，将所在行和列存在集合中
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    row.add(i);//这一行都完蛋了
                    col.add(j);//这一列都完蛋了
                }
            }
        }
        //遍历上面完蛋的行，让他们完蛋
        for(Object num : row.toArray()){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[(int)num][i] = 0;
            }
        }
        //遍历上面完蛋的列，让他们完蛋
        for (Object num : col.toArray()){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][(int)num] = 0 ;
            }
        }
    }
}
```
####
