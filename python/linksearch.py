class Node:
    def __init__(self,key):
        self.key = key
        self.next = None
def search(head,x):
    pos=1
    curr = head
    while curr!=None:
        if curr.key == x:
            return pos
        pos =pos+1
        curr = curr.next
    return -1
            
#drivercode
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)
x=30
print(search(head,x))
    