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
13       Stack<Integer> s1 = new Stack<>();
14        Stack<Integer> s2 = new Stack<>();
15
16        while (l1 != null) {
17            s1.push(l1.val);
18            l1 = l1.next;
19        }
20
21        while (l2 != null) {
22            s2.push(l2.val);
23            l2 = l2.next;
24        }
25
26        int carry = 0;
27        ListNode result = null;
28        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
29            int sum = carry;
30
31            if (!s1.isEmpty()) sum += s1.pop();
32            if (!s2.isEmpty()) sum += s2.pop();
33
34            ListNode newNode = new ListNode(sum % 10);
35            newNode.next = result;
36            result = newNode;
37
38            carry = sum / 10;
39        }
40
41        return result;
42    }
43}