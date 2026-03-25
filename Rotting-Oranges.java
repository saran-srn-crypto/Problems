1import java.util.*;
2
3class Solution {
4    public int orangesRotting(int[][] grid) {
5
6        int rows = grid.length;
7        int cols = grid[0].length;
8
9        Queue<int[]> queue = new LinkedList<>();
10        int fresh = 0;
11
12        for (int i = 0; i < rows; i++) {
13            for (int j = 0; j < cols; j++) {
14
15                if (grid[i][j] == 2) {
16                    queue.offer(new int[]{i, j});
17                }
18
19                if (grid[i][j] == 1) {
20                    fresh++;
21                }
22            }
23        }
24
25        if (fresh == 0) return 0;
26
27        int minutes = 0;
28
29        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
30
31        while (!queue.isEmpty()) {
32
33            int size = queue.size();
34            boolean rotted = false;
35
36            for (int i = 0; i < size; i++) {
37
38                int[] curr = queue.poll();
39
40                for (int[] dir : directions) {
41                    int r = curr[0] + dir[0];
42                    int c = curr[1] + dir[1];
43
44                    if (r >= 0 && c >= 0 && r < rows && c < cols && grid[r][c] == 1) {
45
46                        grid[r][c] = 2;
47                        queue.offer(new int[]{r, c});
48                        fresh--;
49                        rotted = true;
50                    }
51                }
52            }
53
54            if (rotted) minutes++;
55        }
56
57        return (fresh == 0) ? minutes : -1;
58    }
59}