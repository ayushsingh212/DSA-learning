"""
https://leetcode.com/problems/merge-intervals
Problem Statement:
Given a collection of intervals, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]

"""

from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        # Sort by start time
        intervals.sort(key=lambda x: x[0])
        merged = []
        current = intervals[0]
        for i in range(1, len(intervals)):
            if intervals[i][0] <= current[1]:
                # overlapping, extend the end
                current[1] = max(current[1], intervals[i][1])
            else:
                merged.append(current)
                current = intervals[i]
        merged.append(current)
        return merged


if __name__ == "__main__":
    intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
    result = Solution().merge(intervals)
    print("Merged intervals:", result)
