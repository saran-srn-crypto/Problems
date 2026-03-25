1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length-1;
5        while(left<=right)
6        {
7            int mid = left+(right-left)/2;
8
9            if(nums[mid]<target)
10            {
11                left = mid+1;
12            }
13
14            else{
15                right = mid-1;
16            }
17        }
18
19        return left;
20    }
21}