## NEEDS OPTIMIZATION

import math

#Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def splitListToParts(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: List[ListNode]
        """
        
        chead = head
        N = 0

        while chead != None:

            N+=1
            chead=chead.next
        
        x1 = N%k
        x2 = math.floor(N/k)

        split_list = [None] * k
        i = 0

        while head != None:

            x3 = x2
            
            if x1 != 0:

                x3+=1
                x1-=1
            
            while x3>0 and head != None:

                x3-=1
                val = head.val
                head = head.next
                split_list[i] = ListNode(val=val, next=split_list[i])

            cur_node = split_list[i]
            x = None

            while cur_node != None:

                val = cur_node.val
                cur_node = cur_node.next
                x = ListNode(val = val, next = x)
            
            split_list[i] = x

            i+=1

        return split_list