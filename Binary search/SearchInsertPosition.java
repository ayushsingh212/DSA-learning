class Solution {
    public int searchInsert(int[] nums, int target) {
        int ptr1 = 0;
       
        while(ptr1 < nums.length && nums[ptr1] != target)
        {
            ptr1++;
        }
        if(ptr1 == nums.length)
        {
            ptr1 = 0;
            while(ptr1 < nums.length && nums[ptr1] < target)
            {
                ptr1++;
            }
            return ptr1;
        }
        return ptr1;
    }
}