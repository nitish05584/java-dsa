public class iterativelinkedlist {
    
    
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

  public int itrSearch(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
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
        iterativelinkedlist ll=new iterativelinkedlist();
    ll.addFirst(2);

    ll.addFirst(1);

    ll.addLast(3);

    ll.addLast(4);

        ll.print(); 

            System.out.println(ll.itrSearch(3));
             System.out.println(ll.itrSearch(10));

        ll.print();
   } 
}
    

