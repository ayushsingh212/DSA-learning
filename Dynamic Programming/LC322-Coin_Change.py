# Leetcode 322 https://leetcode.com/problems/coin-change/description/

"""
Problem Statement: 
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.
"""

from typing import List  
  
class Solution:
  
    """  
    Return the minimum number of coins needed to form `amount`.  
    If it's impossible, return -1.  
    """      
    def coinChange(self, coins: List[int], amount: int) -> int:  
        
        # Use a sentinel value greater than any possible valid answer (amount + 1 is safe)  
        INF = amount + 1  
        dp = [INF] * (amount + 1)  
        dp[0] = 0  # zero coins needed to make amount 0  
  
        coins.sort()  # sort to allow early break in the inner loop  
  
        # Build up dp for every sub-amount from 1..amount  
        for x in range(1, amount + 1):  
            for c in coins:  
                if c > x:  # since coins is sorted, no need to check larger coins  
                    break  
                # if dp[x - c] is reachable, try to improve dp[x]  
                dp[x] = min(dp[x], dp[x - c] + 1)  
  
        return -1 if dp[amount] == INF else dp[amount] 

if __name__ == "__main__":
  coins = [1,2,5]
  amount = 11
  
  # Complexity: O(amount * len(coins)) time, O(amount) space. 
  output = Solution().coinChange(coins, amount)
  print(f"Solution for coins = {coins} and amount = {amount} is {output}.")