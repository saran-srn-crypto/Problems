1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int min = 1, max = Arrays.stream(piles).max().getAsInt();
4        int ans = max;
5
6        while (min <= max) {
7            int mid = min + (max - min) / 2;
8            long hours = 0;
9
10            for (int pile : piles) {
11                hours += (pile + mid - 1) / mid; // Ceiling division
12            }
13
14            if (hours <= h) {
15                ans = mid;
16                max = mid - 1; // Try smaller speed
17            } else {
18                min = mid + 1; // Need faster speed
19            }
20        }
21
22        return ans;
23    }
24}
25