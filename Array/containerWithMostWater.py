#Q11 on leet code

# You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

# Find two lines that together with the x-axis form a container, such that the container contains the most water.

# Return the maximum amount of water a container can store.



def maxArea(height):
    """
    :type height: List[int]
    :rtype: int
    """
    # we are using two pointers here

    # logic:

    # take area=0 from start check the volumne (using length of smaller vertical line and distance b/w them)

    # if temparea>area: then area=temparea
    # now we move the smaller line towards the larger line
    # repeat the process until both pointers meet   
    
    #area=(n2-n1)*min(height[n2],height[n1])
    area=0
    l=0
    r=len(height)-1
    while l<r:
        temparea=(r-l) * min(height[l],height[r])

        
        if temparea>area:
            area=temparea
        if height[l]>=height[r]:
            r-=1
        else:
            l+=1
    return area


# complexity: 
# time: O(n)
# space: O(1)


    
        