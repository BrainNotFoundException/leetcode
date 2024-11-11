class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        
        nums = nums1 + nums2
        nums.sort()
        numsLen=len(nums)
        num=0
        if numsLen%2==0:
          num = float((nums[int(numsLen/2)]+nums[int((numsLen/2)-1)])/2)
        else:
          num = float(nums[int(numsLen/2)])
        
        return num