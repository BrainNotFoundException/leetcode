## HASH MAP APPROACH

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        len_n = len(nums)
        nums_map = {}
        
        for i in range(len_n):

            nums_map[nums[i]] = i
        
        for i in range(len_n):

            j = target - nums[i]
            
            if j in nums_map and nums_map[j]!=i:

                return [i, nums_map[j]]

        return []















##INEFFICIENT

'''

class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        l=[]
        found=False
        for i in range(len(nums)):
          for j in range(i+1, len(nums)):

            if nums[i]+nums[j]==target:
              l=[i,j]
              found=True
              break
          if found:
            break

        return l

'''