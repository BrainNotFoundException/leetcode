























## INEFFICIENT
## 2 Test Cases Time Limit Exceeded


'''
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        nums.sort()
        ret_list = []

        for i in range(len(nums)):

            target = 0-nums[i]

            l = 0
            h = len(nums)-1

            while l<h:

                if i == l:
                    
                    l+=1
                
                elif i == h:

                    h-=1

                if l == h:

                    break

                s = nums[l] + nums[h]

                if s > target:

                    h-=1
                
                elif s<target:

                    l+=1
                
                else:

                    arr = [nums[i], nums[l], nums[h]]
                    arr.sort()

                    if not arr in ret_list:

                        ret_list.append(arr)
                    
                    l+=1

        return ret_list
'''