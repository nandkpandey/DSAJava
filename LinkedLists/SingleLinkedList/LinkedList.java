package LinkedLists.SingleLinkedList;

public class LinkedList {

    Node head;

    public LinkedList() {

        this.head = null;

    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
    
    }

    public void remove(int data){

       if(head==null)
       return ;

        if(head.data==data)
        {
            head=head.next;
        }
        else{
          Node current=head;
            while(current.next!=null)
            {
                if(current.next.data==data)
                {
                    current.next=current.next.next;
                    return;
                }
                current=current.next;
            }

        }


    }


   public  void printList(){
     Node current=head;
    while(current!=null){

        System.out.print(current.data+"->");
        current=current.next;
    }

    }

public void reverse(){


}





}
