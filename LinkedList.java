public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int count=0;//it is a ststic value it will change if count are decresing and increasing
    // add Node First
    public void addFirst(int data){
        Node newNode=new Node(data);
        count++;
          if(head==null){
             head=tail=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Add Node Last
    public void addLast(int data){
        Node newNode=new Node(data);
        count++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //add the Node in Middle
    public void addMiddle(int idx,int data ){
        Node newNode=new Node(data);
        count++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // remove the first node of linkmedList
    public int removeFirst(){
        if(count==0){//if linked listis empty
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(count==1){//if linked list have only one Node 
            int val=head.data;
            head=tail=null;
            count=0;
            return val;

        }
         int val=head.data;
         head=head.next;
         count--;
         return val;
    }
    //remove the Last node of linkedList
    public int removeLast(){
        if(count==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(count==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0;i<count-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        count--;
        return val;
    }
    //Print the linkedlist 
    public void print()
    {
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2,3);
        ll.print();//print Linked list before deletion
        ll.removeFirst();
        ll.print();//print linked list after deletion
        ll.removeLast();
        ll.print();//print linked list after deletion in last
        System.out.println(ll.count);
        
    }
}