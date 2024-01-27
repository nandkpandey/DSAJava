package Stack;

import java.util.Iterator;

public class Main {
   
    
public static void main(String[] args) {
     Stack stack=new Stack(3);
     stack.push(12);
     stack.push(34);
     stack.push(56);

    // System.out.println(stack.pop());
     System.out.println(stack.peek());
     

     System.out.println("After Implementing Iterable");
     for (Integer integer : stack) {
        System.out.println(integer);
     }

     System.out.println("Iterating by iterator");
      Iterator<Integer> itr=stack.iterator();
while(itr.hasNext()){
   System.out.println(itr.next());
}

   }
}
