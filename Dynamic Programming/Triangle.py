import sys

class Solution(object):
    def minimumTotal(self, triangle):
        if not triangle:
            return 0 
        N = len(triangle)
        for r in reversed(range(N - 1)):
            for i in range(len(triangle[r])): 
                min_below = min(triangle[r + 1][i], triangle[r + 1][i + 1])
                triangle[r][i] = triangle[r][i] + min_below
        return triangle[0][0]
