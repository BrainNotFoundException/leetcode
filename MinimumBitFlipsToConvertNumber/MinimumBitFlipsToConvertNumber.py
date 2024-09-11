## NOT THAT BAD

class Solution(object):
    def minBitFlips(self, start, goal):
        
        """
        :type start: int
        :type goal: int
        :rtype: int
        """

        xor = str(bin(start^goal))

        flip = 0
        
        for i in xor:

            if i == '1':

                flip +=1

        return flip

















## INEFFICIENT


class Solution(object):
    def minBitFlips(self, start, goal):
        
        """
        :type start: int
        :type goal: int
        :rtype: int
        """
        
        startbin = str(bin(start))
        goalbin = str(bin(goal))

        startbin = startbin.replace('0b', '')
        goalbin = goalbin.replace('0b', '')

        lenst = len(startbin)
        lengo = len(goalbin)

        if lenst > lengo:
            goalbin = '0'*(lenst - lengo) + goalbin
        else:
            startbin = '0'*(lengo - lenst) + startbin

        flip = 0

        for i in range(len(goalbin)):

            if startbin[i] != goalbin[i]:

                flip+=1
        
        return flip