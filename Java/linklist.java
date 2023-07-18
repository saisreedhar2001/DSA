public class linklist{
     
    public linkednode head = null;    
    public linkednode tail = null;    
        
  
    public void addNode(int data) {    
    
        linkednode newNode = new linkednode(data);    
            
          
        if(head == null) {    
          
            head = newNode;    
            tail = newNode;    
        }    
        else {    
         
            tail.next = newNode;    
          
            tail = newNode;    
        }    
    }    
        
       
    public void display() {    
        
        linkednode current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
          System.out.print(linkednode.next + " ");  
            System.out.print(current.data + " ");    
           
            current = current.next;  
           
                  
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        linklist sList = new linklist();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.display();    
        
    }    
}