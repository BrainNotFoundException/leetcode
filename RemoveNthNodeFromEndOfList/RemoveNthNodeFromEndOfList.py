# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):

    def removeNthFromEnd(self, head, n):
        
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """

        val = head
        c=0

        while val != None:

            val = val.next
            c+=1
        
        
        c = c-n+1
        new_node = head
        l = []
        
        for i in range(c):

            if i!=c-1:
                l.append(new_node.val)

            new_node = new_node.next
        
        for i in range(len(l)-1, -1, -1):

            new_node = ListNode(val = l[i], next = new_node)
        
        return new_node