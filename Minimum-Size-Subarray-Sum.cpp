1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i = 0;
4        int curr_sum = 0;
5        int ans = Integer.MAX_VALUE;
6
7        for (int j = 0; j < nums.length; j++) {
8            curr_sum += nums[j];
9
10            while (curr_sum >= target) {
11                ans = Math.min(ans, j - i + 1);
12                curr_sum -= nums[i];
13                i++;
14            }
15        }
16
17        return ans == Integer.MAX_VALUE ? 0 : ans;
18    }
19}