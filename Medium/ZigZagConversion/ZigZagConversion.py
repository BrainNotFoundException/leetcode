class Solution(object):
    def convert(self, s, numRows):
        
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """

        str_len = len(s)

        if numRows == 1 or str_len<=numRows :
            return s

        midNum = 0
        if numRows % 2 == 0:
            midNum = int(numRows/2)
        else:
            midNum = int((numRows + 1)/2)
        out_str = ''
        
        step1 = (numRows - 1) * 2
            
        #first row
        for i in range(0, str_len, step1):
            out_str = out_str + s[i]

        #between first and last row
        for i in range(1 , numRows-1):
            
            up = False
            cursor_pos = i
            out_str = out_str + s[i]
            
            while True:
                
                #different step while moving across letters in string up / down
                
                if up:
                    step = i*2
                else:
                    step = (numRows - i - 1)*2

                cursor_pos += step

                if cursor_pos >= str_len:
                    break
                
                if up:
                    up = False
                else:
                    up = True

                out_str = out_str + s[cursor_pos]
                
        #last row
        for i in range(numRows-1, str_len, step1):
            out_str = out_str + s[i]
    
        return out_str