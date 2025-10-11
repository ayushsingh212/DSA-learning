# Leetcode 230 https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

"""
Problem Statement:
Given a binary search tree (BST), return the kth smallest element in it.
Use the BST property (in-order traversal gives sorted order).
"""

from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    """
    Perform an in-order traversal and count until we reach the k-th smallest.
    """

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.k = k
        self.result = None
        
        def inorder(node):
            if not node or self.result is not None:
                return
            
            inorder(node.left)
            
            self.k -= 1
            if self.k == 0:
                self.result = node.val
                return
            
            inorder(node.right)
        
        inorder(root)
        return self.result

# Helper function to build tree from list
def build_bst_from_list(values):
    """
    Build a BST from level-order list representation.
    None values indicate empty nodes.
    """
    if not values:
        return None
    from collections import deque
    root = TreeNode(values[0])
    queue = deque([root])
    idx = 1
    while queue and idx < len(values):
        node = queue.popleft()
        if values[idx] is not None:
            node.left = TreeNode(values[idx])
            queue.append(node.left)
        idx += 1
        if idx < len(values) and values[idx] is not None:
            node.right = TreeNode(values[idx])
            queue.append(node.right)
        idx += 1
    return root

if __name__ == "__main__":
    values = [3, 1, 4, None, 2]  # BST in level-order
    k = 1
    root = build_bst_from_list(values)
    result = Solution().kthSmallest(root, k)
    print(f"Kth smallest element (k={k}) is: {result}")
