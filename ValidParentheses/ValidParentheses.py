class Solution:
    
    def isValid(self, s: str) -> bool:
        
        lst = []
        found = False
        combo_map = {')': '(', ']':'[', '}':'{'}
        
        for i in s:

            if i in combo_map:

                if len(lst) > 0:

                    if combo_map[i] == lst[-1]:

                        lst.pop()

                    else:
                    
                        found = True
                        break
                else:

                    found = True
                    break

            else:

                lst.append(i)
        
        if len(lst)>0 or found:

            return False
        
        else:

            return True