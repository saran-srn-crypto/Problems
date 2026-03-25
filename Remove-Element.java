1class Solution {
2    public int removeElement(int[] nums, int val) {
3       int n = nums.length;
4       int count = 0;
5       for(int i=0;i<n;i++)
6       {
7        if(nums[i]!=val)
8        {
9            nums[count]=nums[i];
10            count++;
11        }
12       }
13       return count;
14    }
15}