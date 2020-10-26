package com.ming.sort;

public class TestMergeSort {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printNode(node1);
        System.out.println("#################");
        MergeSort mergeSort = new MergeSort();
        ListNode node = mergeSort.sortList(node1);
        printNode(node);

    }
    public static void printNode(ListNode node){
        while (node.next != null){
            System.out.print(node.val+",");
            node = node.next;
        }
        System.out.println(node.val);
    }
}
