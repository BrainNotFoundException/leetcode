class Solution:
    def maxArea(self, height: list[int]) -> int:
        left=0
        right=len(height)-1
        maxArea=0
        while left<right:
          leftLine=height[left]
          rightLine=height[right]
          width=right-left
          area=0
          if leftLine<rightLine:
            area=leftLine*width
            left+=1
          else:
            right-=1
            area=rightLine*width
          
          if area>maxArea:
            maxArea=area

        return maxArea