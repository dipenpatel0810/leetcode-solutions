class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        lookup = {}
        
        for i in range(len(nums)):
            print(nums[i])
            comp = target - nums[i]
            
            if comp in lookup:
                return [lookup[comp], i]
            else:
                lookup[nums[i]] = i
        
        