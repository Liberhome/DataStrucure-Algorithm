```java
//merge算法 递归版本：把四种情况考虑清楚：l1为空；l2为空；l1当前节点值小于l2；l1当前节点值大于l2；
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
迭代版本：
//merge算法 迭代版本：把四种情况考虑清楚：l1为空；l2为空；l1当前节点值小于l2；l1当前节点值大于l2；
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);//这样，建立一个位于-1的node

        ListNode prev = prehead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 :l1;
        return prehead.next;
    }
}

```
