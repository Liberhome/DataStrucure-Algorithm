方法1：空间O(n)Hashset.contains()
```java

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        //哈希表.contains()真好用
        HashSet<ListNode> hasCycleSet = new HashSet<>();
        while(head!=null){
            if(hasCycleSet.contains(head)){
                //哈哈哈哈抓到原型了，那就是true
                return true;
            }else{
                //没抓到++下一个继续
                hasCycleSet.add(head);
            }
            head=head.next;
        }
        //head==null说明没有环，有环不可能有null
        return false;
    }
}
```
方法2：空间O(1)快慢指针
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       //judge null or one node case
       if( head == null || head.next == null){
           return false;
       }
       //create two pointer fast & slow
       ListNode slow = head;
       ListNode fast = head.next;
       //
       while(slow != fast){
           if(fast == null || fast.next ==null){
               //head==null说明没有环，有环不可能有null
               return false;
           }
           //没抓到++下一个继续,另外速度不一样哦，有环一定会再相遇跳出while
           slow = slow.next;
           fast = fast.next.next;
       }
       //有环一定会再相遇跳出while
       return true;
    }
}
```
