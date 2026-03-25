1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left =0;
4        int right = nums.length-1;
5        while(left<=right)
6        {
7            int mid = left+(right-left)/2;
8
9            if(nums[mid] == target)
10            {
11                return true;
12            }
13            if(nums[left]==nums[mid] && nums[mid]==nums[right])
14            {
15                left++;
16                right--;
17            }
18            else if(nums[left]<=nums[mid])
19            {
20                if(target >=nums[left] && target < nums[mid])
21                {
22                    right = mid-1;
23                }
24                else 
25                {
26                    left = mid+1;
27                }
28             }
29             else{
30                if(target >nums[mid] && target<=nums[right])
31                {
32                    left = mid+1;
33                }
34                else {
35                    right = mid-1;
36                }
37             }
38
39        }
40        return false;
41    }
42}