# Find the Index of the First Occurrence of a string on another String
# Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

# Example - Input: haystack = "sadbutsad", needle = "sad"
#           Output: 0
#           Explanation: "sad" occurs at index 0 and 6.
#           The first occurrence is at index 0, so we return 0. Else we return -1 if string not found.

class Solution(object):
    def strStr(self, haystack, needle):
        if needle == "":
            return 0
        
        for i in range(len(haystack) - len(needle) + 1):
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1
    
# Example Usage

if __name__ == "__main__":
    s = Solution()
    print(s.strStr("hello", "ll")) # Prints 2 
    print(s.strStr("hello", "world")) # Prints -1 since "world" does not exist in "hello"