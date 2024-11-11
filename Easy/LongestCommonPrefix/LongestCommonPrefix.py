class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """

        com_pre = ''
        comp_str = strs[0]
        comp_len = len(comp_str)
        l_len = len(strs)

        flag = False

        for i in range(comp_len):
            
            for j in range(1, l_len):

                c_str = strs[j]
                
                if len(c_str) >= (i+1):

                    if not c_str[i] == comp_str[i]:

                        flag = True
                        break

                else:
                    flag = True
                    break
            
            if not flag:

                com_pre = com_pre + comp_str[i]

        return com_pre