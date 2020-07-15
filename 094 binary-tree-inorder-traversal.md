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
    public List<Integer> inorderTraversal(TreeNode root) {
        //一眼就看出来是DFS中序啦，Tree就是这样，麻烦是麻烦，套路比较固定
        
        /*方法一：递归（这里用List）时间复杂度：O(n);空间复杂度：最坏情况下需要空间O(n)，平均情况为O(logn)。*/
        
        List< Integer > ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public void helper (TreeNode node, List < Integer > ans){
        if(node != null){
            if(node.left != null){
                helper(node.left, ans);
            }
            ans.add(node.val);
            if(node.right != null){
                helper(node.right, ans);
            }
        }
    }
}
```
方法二：

```java

class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        //一眼就看出来是DFS中序啦，Tree就是这样，麻烦是麻烦，套路比较固定
        /*方法2：迭代 */
        ArrayList < Integer > ans = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > (); //这里用栈实现
        TreeNode curr = root ;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;//左
            }
            curr = stack.pop();
            ans.add(curr.val);//中
            curr=curr.right;//右
        }
        return ans;
    }

}
```
