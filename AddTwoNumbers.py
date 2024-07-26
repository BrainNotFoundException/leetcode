# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        l=[]
        numl1=0
        numl2=0
        cl1=0
        cl2=0
        notnonel1=True
        notnonel2=True
        while notnonel1 or notnonel2:

          if notnonel1:

            numl1+=(l1.val)*(10**cl1)
            if l1.next==None:
              notnonel1=False
            cl1+=1
            l1=l1.next
          
          if notnonel2:

            numl2+=(l2.val)*(10**cl2)
            if l2.next==None:
              notnonel2=False
            cl2+=1
            l2=l2.next
        
        l=str(numl1+numl2)
        lnode=None
        for i in l:
          lnode=ListNode(int(i),lnode)

        return lnode