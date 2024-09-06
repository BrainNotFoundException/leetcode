























## INEFFICIENT

'''
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        hashmap = {}
        ret_list = []
        target = 0

        for i in range(len(nums)):

            if not nums[i] in hashmap:

                hashmap[nums[i]] = [i]
            else:

                hashmap[nums[i]] = hashmap[nums[i]] + [i]

        for i in range(len(nums)):

            c_tar = target - nums[i]

            for j in range(len(nums)):

                if j==i:
                    continue

                c = c_tar - nums[j]

                if c in hashmap:

                    for k in hashmap[c]:

                        if k!=i and k!=j:

                            arr = [nums[i], nums[j], c]
                            arr.sort()

                            if not arr in ret_list:

                                ret_list.append(arr)
                        
        return ret_list
'''