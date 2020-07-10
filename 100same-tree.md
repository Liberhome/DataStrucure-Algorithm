递归思路在树里面很普遍
但是不要漏掉所有可能的递归出口哦~

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null)||(p != null && q == null)){
            return false;
        }
        //不要忘记判断节点的值哦~
        if(p.val !=q.val){
            return false;
        }
        return  isSameTree(p.right,q.right) && isSameTree(p.left, q.left) ;
    }
}
```
