class Solution {
public:
    bool canCross(vector<int>& stones) {
        int n = stones.size();
        unordered_map<int, unordered_set<int>> dp;
        dp[0].insert(0);
        for (int stone : stones) {
            for (int k : dp[stone]) {
                for (int jump = k - 1; jump <= k + 1; jump++) {
                    if (jump > 0) {
                        int reach = stone + jump;
                        if (reach == stones.back()) return true;
                        if (binary_search(stones.begin(), stones.end(), reach)) {
                            dp[reach].insert(jump);
                        }
                    }
                }
            }
        }
        return false;
    }
};
