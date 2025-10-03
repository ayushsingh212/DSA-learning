/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses. 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]


Example 2:

Input: n = 1
Output: ["()"]
 * 
 */


import java.util.*;

class Solution {
public List<String> generateParenthesis(int n) {
List<String> ans = new ArrayList<>();
backtrack(ans, "", n, 0, 0);
return ans;
}

private static void backtrack(List<String> ans, String temp, int n, int leftcnt, int rightcnt) {
    if(temp.length() == 2 * n){
        ans.add(temp);
        return;
    }

    if(leftcnt < n){
        backtrack(ans, temp + "(", n, leftcnt + 1, rightcnt);
    }

    if(leftcnt > rightcnt){
        backtrack(ans, temp + ")", n, leftcnt, rightcnt + 1);
    }
}

public static void main(String[] args) {
    Solution sol = new Solution();

    int n1 = 3;
    System.out.println("n = " + n1 + " → " + sol.generateParenthesis(n1));

    int n2 = 1;
    System.out.println("n = " + n2 + " → " + sol.generateParenthesis(n2));

    int n3 = 4;
    System.out.println("n = " + n3 + " → " + sol.generateParenthesis(n3));
}

}