class Solution:
    def longestPalindrome(self, s: str) -> str:
        temp_s=''
        maxLength=0
        maxLengthPal=''
        for i in range(len(s)):
          temp_s=''
          for j in range(i, len(s)):
            temp_s=temp_s + s[j]

            if temp_s[::-1]==temp_s:
              if len(temp_s)>maxLength:
                maxLength=len(temp_s)
                maxLengthPal=temp_s
        return maxLengthPal