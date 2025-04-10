public class palindromeLinkedList {
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addLast("1");
        list.addLast("6");
        list.addLast("6");
        list.addLast("6");
        list.addLast("1");
        boolean res=list.palindrome(list.head);
        System.out.println(res);
        list.printLL();
    }
}
class LinkedList{
    Node head;
    class Node{
        String  data;
        Node next;
        Node(String data){
            this.data=data;
            this .next=null;
        }
    }
    public Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            // reverse
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        if(head.next==null){
            return head;
        }
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean palindrome(Node head){
        if(head.next==null){
            return true;
        }
        Node temp=findMiddle(head);
        Node secondHalStart=reverse(temp.next);
        temp=head;
        while(secondHalStart!=null ){
            if(temp.data!=secondHalStart.data){
                return false;
            }

            secondHalStart=secondHalStart.next;
            temp=temp.next;
        }
        return true;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){

            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printLL(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
