# NOT SATISFIED

class Solution:
    
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        
        len_nums = len(nums)

        lst = []
        
        nums.sort()

        for i in range(len_nums):
            
            if i>0:

                if nums[i-1] == nums[i]:
                    
                    continue

            x = nums[i]
            j = i+1
            k = len_nums-1

            while j<k:

                sum = x + nums[j] + nums[k]

                if sum == 0:
                    
                    lst.append([x, nums[j], nums[k]])

                    pr_j = nums[j]
                    pr_k = nums[k]
                    j+=1
                    k-=1

                    while j<k and pr_j == nums[j]:

                        j+=1

                    while j<k and pr_k == nums[k]:

                        k-=1

                
                elif sum < 0:

                    j+=1
                
                else:

                    k-=1

        return lst