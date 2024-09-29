## HASH MAP APPROACH

class Solution:
    
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        
        len_nums = len(nums)
        hash_map = {}
        nums.sort()
        lst=[]

        for i in range(len_nums):

            if not nums[i] in hash_map:

                hash_map[nums[i]] = [i]
        
            else:

                hash_map[nums[i]].append(i)
    
        p_i = None
        p_j = None

        for i in range(len_nums-2):

            if nums[i] == p_i:

                continue

            p_i = nums[i] 

            for j in range(i+1, len_nums-1):

                if nums[j] == p_j:

                    continue
                
                p_j = nums[j]

                target = - nums[i] - nums[j]

                if target in hash_map:

                    for k in hash_map[target]:

                        if k>j:

                            lst.append([nums[i], nums[j], target])
                            break
        
        return lst


# NOT SATISFIED
# TWO POINTER APPROACH

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