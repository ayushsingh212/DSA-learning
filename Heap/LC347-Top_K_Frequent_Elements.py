"""
https://leetcode.com/problems/top-k-frequent-elements/description/
Problem Statement:
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.
You may return the answer in any order.

Example:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

"""

from typing import List
import heapq
from collections import Counter


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)  # element -> frequency
        # Use a min-heap of size k on frequency
        # (freq, num) so that we pop lowest freq when size > k
        heap = []
        for num, freq in count.items():
            heapq.heappush(heap, (freq, num))
            if len(heap) > k:
                heapq.heappop(heap)
        # Extract numbers from heap
        res = [num for freq, num in heap]
        return res


if __name__ == "__main__":
    nums = [1, 1, 1, 2, 2, 3]
    k = 2
    out = Solution().topKFrequent(nums, k)
    print("Top k frequent:", out)
