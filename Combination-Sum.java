1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(int[] candidates, int remaining, int start,
9                           List<Integer> current, List<List<Integer>> result) {
10        if (remaining == 0) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14
15        for (int i = start; i < candidates.length; i++) {
16            if (candidates[i] <= remaining) {
17                current.add(candidates[i]);
18                backtrack(candidates, remaining - candidates[i], i, current, result);
19                current.remove(current.size() - 1);
20            }
21        }
22    }
23}
24