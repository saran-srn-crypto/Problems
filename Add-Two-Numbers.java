1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode current = dummy;
15        int carry = 0;
16        while(l1!=null || l2!=null || carry!=0)
17        {
18            int sum = carry;
19            if(l1!=null)
20            {
21                sum+=l1.val;
22                l1 = l1.next;
23            }
24
25            if(l2!=null)
26            {
27                sum+=l2.val;
28                l2=l2.next;
29            }
30            carry = sum/10;
31            current.next = new ListNode(sum%10);
32            current = current.next;
33        }
34        return dummy.next;
35    }
36}