public class linkedlist {
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

    public void addFirst(int data){
    Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

     newNode.next=head;

     head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
       head=tail=newNode;
       return;
        }
        tail.next=newNode;
        tail=newNode;
    }
   public void print(){
    if(head==null){
        System.out.println("ll is empty");
    }
    Node temp=head;
  while(temp !=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
  }
  System.out.println("null");
   }
    public static void main(String[] args) {
      linkedlist ll=new linkedlist();
      ll.print();
      ll.addFirst(2);
         ll.print();
      ll.addFirst(1);
         ll.print();
      ll.addLast(3);
         ll.print();
      ll.addLast(4);
         ll.print();
      
    }
}
