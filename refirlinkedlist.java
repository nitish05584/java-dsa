public class refirlinkedlist {
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
  public int removeFirst(){
  if(size==0){
    System.out.println("ll is empty");
    return Integer.MIN_VALUE;
  }
  else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
  }
  int val=head.data;
  head=head.next;
  size--;
  return val;
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
        refirlinkedlist ll=new refirlinkedlist();
    ll.addFirst(2);

    ll.addFirst(1);

    ll.addLast(3);

    ll.addLast(4);

        ll.print(); 

        ll.removeFirst();
        ll.print();
   } 
}
