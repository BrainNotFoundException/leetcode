class Solution:
    def minLength(self, s: str) -> int:
        
        i = 1
        while i < len(s):

            prev = s[i-1]

            if prev == 'A':

                if s[i] == 'B':

                    s = s[:i-1] + s[i+1:]
                    i = 0

            elif prev == 'C':

                if s[i] == 'D':

                    s = s[:i-1] + s[i+1:]
                    i = 0
            
            i += 1

        return len(s)