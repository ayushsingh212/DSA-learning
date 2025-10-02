/*
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]
 * 
 */


import java.util.*;

public class palindrome_partitioning {
    public static void main(String[] args) {
        Solution sol = new Solution();

        List<String> tests = Arrays.asList(
            "aab",        // typical small case
            "a",          // single char
            "abba",       // contains longer palindromes
            "aabb",       // multiple branching
            "racecar",    // full palindrome
            "abc"         // no repeats except single letters
        );

        for (String s : tests) {
            List<List<String>> res = sol.partition(s);
            System.out.println("Input: \"" + s + "\"");
            printPartitions(res);
            System.out.println("Count: " + res.size());
            System.out.println("-----");
        }
    }

    private static void printPartitions(List<List<String>> res) {
        System.out.print("[ ");
        for (List<String> part : res) {
            System.out.print("[ ");
            for (String seg : part) {
                System.out.print(seg + " ");
            }
            System.out.print("] ");
        }
        System.out.println("]");
    }
}

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        fn(0, s, cur, res);
        return res;
    }
    void fn(int index, String s, List<String> cur, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                cur.add(s.substring(index, i + 1));
                fn(i + 1, s, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
    boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
