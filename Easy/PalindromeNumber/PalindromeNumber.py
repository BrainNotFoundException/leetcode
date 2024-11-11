class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        sx = str(x)
        if sx[::-1] == sx:
            return True
        else:
            return False
            
        