public class removenthnode {
   
      
      public static class Node{
        int data;
        Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
   public static Node tail;
   public static int size;
   public static void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
    head=tail=newNode;
    return;
    }
    newNode.next=head;
    head=newNode;
   }
    public static void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
   }


   public void deleteNthformEnd(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
       temp=temp.next;
       sz++;
    }
    if(n==sz){
        head=head.next;
    }
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i<iToFind){
    prev=prev.next;
    i++;
    }
    prev.next=prev.next.next;
    return; 
   }

   public Node findMid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
   }
   public boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    Node midNode=findMid(head);
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;
    Node left=head;
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
   }
  
  
  
 public void print(){
   if(head==null){
      System.out.println("ll is empty");
   }
   Node temp=head;
   while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
   }
   System.out.println("null");

 }
    public static void main(String[] args) {
        removenthnode ll=new removenthnode();
    ll.addFirst(2);

    ll.addFirst(1);

    ll.addLast(2);

    ll.addLast(1);

        ll.print(); 

     System.out.println(ll.checkPalindrome());
        ll.print();
   } 
}

