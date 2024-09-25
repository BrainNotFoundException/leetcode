class Solution:

    lst = []

    def getCombo(self, n, s, num_map):

        if len(n) == 0:
            return

        for i in num_map[n[0]]:
            s = s + i
            if len(n) == 1:
                self.lst.append(s)
            else:
                self.getCombo(n[1:], s, num_map)
            s = s[:-1]

    def letterCombinations(self, digits: str) -> list[str]:
            
        num_map = {'2': ['a', 'b', 'c'], '3': ['d', 'e', 'f'], '4': ['g', 'h', 'i'], '5': ['j', 'k', 'l'], '6': ['m', 'n', 'o'], '7': ['p', 'q', 'r', 's'], '8': ['t', 'u', 'v'], '9': ['w', 'x', 'y', 'z']}

        self.lst = []

        self.getCombo(digits, '', num_map)

        return self.lst