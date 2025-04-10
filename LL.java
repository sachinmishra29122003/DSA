
public class LL {
    // reverse linked list
    Node head;
    private int size;
        LL(){
            this.size=0;
        }
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
                size++;
            }
        }
        // add first
        public void addFirst(String data){
            size++;
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }System.out.println(size);
            newNode.next=head;
            head=newNode;
        }
        // add at last
        public void addLast(String data){
            size++;
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
        // print  
        public void printLL(){
            if(head==null){
                System.out.println("Linked list is Empty");
                return;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }
        public void deleteFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            head=head.next;
            size--;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            // Node currNode=head;
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node last=head.next;
            while(last.next!=null){
                last=last.next;
                secondLast=secondLast.next;
            }
            // while(currNode.next.next!=null){
            //     currNode=currNode.next;
            //     // System.out.print(currNode.data+" ->");
            // }
            // currNode.next=null;
            secondLast.next=null;
        }
        public void reverseLinkedlist(){
            Node currNode=head.next;
            Node preNode=head;
            while(currNode!=null){
                if(head==null || head.next ==null){
                    return;
                }
                Node nextNode=currNode.next;
                currNode.next=preNode;
                // update
                preNode=currNode;
                currNode=nextNode;
            }
            head.next=null;
            head=preNode;
        }
        public Node reverseRecurr(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newhead=reverseRecurr(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
        }
    
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("This ");
        list.addLast("is ");
        list.addLast("a ");
        list.addLast("list ");
       list.head=list.reverseRecurr(list.head);
        list.printLL();
    }
}
