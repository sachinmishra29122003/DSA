public class removeNthNode {
    public LL removeNth(LL list,int n){
        if(list.head==null){
            return list;
        }
        int size=0;
        LL.Node currNode=list.head;
        while(currNode!=null){
            size++;
            currNode=currNode.next;
        }
        currNode=list.head;
        LL.Node prNode=list.head;
        for(int i=0;i<size-n+1;i++){
            prNode=prNode.next;
        }
        prNode.next=prNode.next.next;
        return list;
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("1");
        list.addLast("2");
        list=list.removeNth(list,2);
        list.printLL();
    }
}

 class LL {
    // reverse linked list
    Node head;
     int size;
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
        public LL removeNth(LL list,int n){
            if(list.head==null){
                return list;
            }
            if(head.next==null){
                return null;
            }
            int size=0;
            LL.Node currNode=list.head;
            while(currNode!=null){
                currNode=currNode.next;
                size++;
            }
            currNode=list.head;
            LL.Node prNode=list.head;
            int i=1;
            while(i<size-n){
                prNode=prNode.next;
                i++;
            }
            prNode.next=prNode.next.next;
            return list;
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
        }}