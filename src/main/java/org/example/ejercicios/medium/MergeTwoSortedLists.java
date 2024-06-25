package org.example.ejercicios.medium;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null){
            if (list1!=null) return list1;
            if (list2!=null)return list2;
            return list1;
        }


        ListNode head = new ListNode();
        ListNode iterator = head;

        while (true){
                if (list2.val < list1.val){
                    iterator.val = list2.val;
                    list2 = list2.next;
                    if (list2 == null){
                        iterator.next = list1;
                        break;
                    } else {
                        iterator.next = new ListNode();
                        iterator = iterator.next;
                    }
                } else {
                    iterator.val = list1.val;
                    list1 = list1.next;
                    if (list1 == null){
                        iterator.next = list2;
                        break;
                    } else {
                        iterator.next = new ListNode();
                        iterator = iterator.next;
                    }
                }
        }
        return head;
    }
}
