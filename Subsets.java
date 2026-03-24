1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        int n = nums.length;
5        for(int i=0;i<(1<<n);i++)
6        {
7            List<Integer> subset = new ArrayList<>();
8            for(int j=0;j<n;j++)
9            {
10                if((i&(1<<j))>0)
11                {
12                    subset.add(nums[j]);
13                }
14            }
15            result.add(subset);
16        }
17        return result;
18    }
19}