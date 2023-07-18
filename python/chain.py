class chain:
    def __init__(self,b):
        self.BUCKET=b;
        self.table=[[] for i in range (b)]
    
    def insert(self,x):
        i = x%self.BUCKET
        self.table[i].append(x)
    def delete(self,x):
         i = x%self.BUCKET
         self.table[i].remove(x)
    def search(self,x):
         i = x%self.BUCKET 
         
         return(x in self.table[i])   
     

a= chain(7)

a.insert(70)
a.insert(71)
a.insert(9)
a.insert(56)
a.insert(72)

print(a.table)
a.delete(9)
a.search(71)
    