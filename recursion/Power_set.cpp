/*
Power Set (All Subsequences of a String)

Problem Statement:
Given a string, generate all possible subsequences (subsets of characters) of the string.
A subsequence is a sequence that can be derived from the given string by deleting some or no
elements without changing the order of the remaining elements. The power set of a string includes
all possible subsequences, including the empty subsequence.
 
Example:
Input: s = "abc"
Output: "" "a" "b" "ab" "c" "ac" "bc" "abc"
Explanation: For the string "abc", the subsequences are all possible combinations of its characters,
including the empty string, single characters, and combinations in the original order.

Approach:
We use a recursive approach based on the pick/not-pick pattern to generate all subsequences:
- At each index of the string, we have two choices:
1. Pick the current character and include it in the subsequence.
2. Not pick the current character and move to the next index.

Time and Space Complexity:
Time Complexity: O(2^n), where n is the length of the string, as we explore all possible subsequences.
Space Complexity: O(n) for the recursion stack and the temporary string used to store the subsequence.
 */

#include <bits/stdc++.h>
using namespace std;

void solve(int i, string s, string &temp) {
    // Base case: if we reach the end of the string, print the current subsequence
    if (i == s.length()) {
        cout << temp << " ";
        return;
    }
    // Pick the current character
    temp += s[i];
    solve(i + 1, s, temp); // Recurse for the next character
    // Not pick the current character (backtrack by removing the last character)
    temp.pop_back();
    solve(i + 1, s, temp); // Recurse for the next character
}

int main() {
    string s = "abc";
    string temp = ""; // Temporary string to store subsequences
    cout << "All possible subsequences are: " << "\n";
    solve(0, s, temp);   // Start recursion from index 0
    return 0;
}