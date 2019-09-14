package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 11:43 2019/9/13
 * @MODIFY:
 */

class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
public class Add_two {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = new ListNode(-1);//这个是头，里面不包存数据
        ListNode p = head;//指向当前最后一个元素
        int sum=0;
        while(l1!=null&&l2!=null){
            sum = l1.val+l2.val+sum;
            p.next = new ListNode(sum%10);
            sum = sum/10;
            p = p.next;
            l1 = l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            sum = l1.val+sum;
            p.next = new ListNode(sum%10);
            sum = sum/10;
            p = p.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val+sum;
            p.next = new ListNode(sum%10);
            sum = sum/10;
            p = p.next;
            l2 = l2.next;
        }
        if(sum!=0){
            p.next = new ListNode(sum);
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode  l1 = new ListNode(2);

    }
}
