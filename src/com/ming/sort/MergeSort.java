package com.ming.sort;

public class MergeSort {
   //慢指针找到中间节点
   ListNode sortList(ListNode head){
       if (head == null || head.next == null)
           return head;
       ListNode fast = head.next.next;
       ListNode slow = head;
       while(fast != null && fast.next !=null){
           fast = fast.next.next;
           slow = slow.next;
       }
       //递归，对子表排序
       ListNode r = sortList(slow.next);
       slow.next = null;
       ListNode l = sortList(head);
       //合并两个子表
       return merge(l,r);
   }

   //合并两个链表
    ListNode merge(ListNode l, ListNode r){
        //dummy头结点
        ListNode dummy = new ListNode(0),node;
        node = dummy;
        while (l != null && r != null){
            if (l.val < r.val){
                node.next = l;
                l = l.next;
            } else {
                node.next = r;
                r = r.next;
            }
            node = node.next;
        }
        if (l != null)
            node.next = l;
        else
            node.next = r;
        return dummy.next;
    }
}

/**
 * 定义节点信息
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}