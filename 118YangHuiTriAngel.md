```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
         //new 2D List
         List<List<Integer>> YangHuiTriAngel = new ArrayList<List<Integer>>();
         //if 0 row
         if (numRows==0){
             return YangHuiTriAngel;
         }
         //new the 1 line
         YangHuiTriAngel.add(new ArrayList<>());
         //assign the first element to 1
         YangHuiTriAngel.get(0).add(1);
         //assign every element
         for(int count=1;count<numRows;count++){
             //create a new row
             List<Integer> myRow = new ArrayList<>();
             //get the previous row
             List<Integer> previousRow = YangHuiTriAngel.get(count-1);
             //every line's first character is 1
             myRow.add(1);
             //keyPoint：其实就是因为不同人找到的这个不同才有了不同的方法 这里的这个应该是普通人都可以看到的规律
             for(int i=1 ; i<count; i++){
                 myRow.add(previousRow.get(i-1)+previousRow.get(i));
             }
             myRow.add(1);
             YangHuiTriAngel.add(myRow);
         }
         return YangHuiTriAngel;

    }
}
```
