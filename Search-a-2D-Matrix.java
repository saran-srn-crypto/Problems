1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3       int m = matrix.length;
4       int n = matrix[0].length;
5
6       int left =0;
7       int right = m*n -1;
8       while(left<=right)
9       {
10        int mid = left+(right-left)/2;
11        int row = mid/n;
12        int col = mid%n;
13        int value = matrix[row][col];
14        if(target == value)
15        {
16            return true;
17        }
18        if(target>value)
19        {
20            left = mid+1;
21        }
22        else {
23            right = mid-1;
24        }
25
26       }
27       return false;
28
29    }
30}