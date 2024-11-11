class Solution:
    def minimumPushes(self, word: str) -> int:

        letter_map = {}

        for i in word:

            if not i in letter_map:

                letter_map[i] = 1
            
            else:

                letter_map[i] += 1

        lst = []
        for i in letter_map:

            lst.append(letter_map[i])

        if len(letter_map) < 9:

            s = 0

            for i in lst:

                s+= i

            return s

        lst.sort(reverse = True)
        
        len_lst = len(lst)
        x = 1
        c = 0
        s = 0
        for i in range(len_lst):

            s+=lst[i] * x
            c+=1
            
            if c == 8:
               x+=1
               c=0

        return s