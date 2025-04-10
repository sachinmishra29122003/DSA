public class CycleInLinklist{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast("1");
        list.addLast("2");
        System.out.println(list.cycle());
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
    public boolean cycle(){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle ){
                return true;
            }
        }
        return false;
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