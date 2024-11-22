##    *********************************************************************
##    THIS PROBLEM HAS BEEN SOLVED ASSUMING X CANNOT STORE A 64 BIT INTEGER
##    *********************************************************************

#More Efficient ↓
class Solution:
    def reverse(self, x: int) -> int:
        
        if x>(2**31)-1 or x<-2**31:
            return 0

        s=1
        if x<0:
            s = -1
        
        x=abs(x)
        out = 0
        while x>0:

            out = out*10 + x%10
            x = x//10

            if out>2**31-1:
                return 0
        
        return s*out
    
'''
class Solution(object):

    def reverse(self, x):

        """
        :type x: int
        :rtype: int
        """

        neg_flag = False
        if x<0:
            neg_flag = True
            x = abs(x)
        
        if x > (2**31 - 1) or x < (-2**31):
            return 0
        
        rx = 0

        while x>0:
            rx = rx*10 + x%10
            x = x//10

        if rx >= (-2**31) and rx <= (2**31 - 1):
            if neg_flag:
                return -rx
            else:
                return rx
        else:
            return 0
'''