public class AddTwoNumber2{
    // Ques 2 in leet code
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(2);
        list.addLast(4);
        list.addLast(3);
        LinkedList list2=new LinkedList();
        list2.addLast( 5);
        list2.addLast( 6);
        list2.addLast( 4);
        // list2.printLL();
        list.addTwoLL(list.head, list2.head);
        // list.printLL();
    }   
}
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node( int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public Node addTwoLL(Node head1,Node head2){
        Node curr1=head1;
        Node curr2=head2;
        int carry=0;
        while(curr1!=null && curr2!=null){
            if(curr1.data+curr2.data+carry<10){
                curr1.data=curr1.data+curr2.data+carry;
                carry=0;
            }
            else{
                curr1.data=(curr1.data+curr2.data+carry)%10;
                carry=1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        if(curr1!=null){
            printLL(head1);
            return head1;
        }
        else if(curr2!=null){
            Node t=curr2;
            while(curr2!=null){
                Node newNode=new Node(t.data);
                curr1.next=newNode;
                curr1=curr1.next;
                t=t.next;
                curr2=curr2.next;
            }
        }
        printLL(head1);
        return head1;
    }
}