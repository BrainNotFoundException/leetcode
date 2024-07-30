class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
      maxLength=0
      temp_s=''
      for i in range(len(s)):
        for j in range(i, len(s)):
          if s[j] in temp_s:
            break
          else:
            temp_s=temp_s+s[j]
        if len(temp_s) > maxLength:
          maxLength = len(temp_s)
        temp_s=''
      return maxLength