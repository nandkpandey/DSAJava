package LinkedLists.SingleLinkedList;

public class Main {
  
    public static void main(String[] args) {
        
   LinkedList linkedList=new LinkedList();
   linkedList.add(12);
   linkedList.add(23);
   linkedList.add(45);
   linkedList.add(83);

   linkedList.printList();

   linkedList.remove(45);
   linkedList.printList();

    }


}
