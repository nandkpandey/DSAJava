package Stack;

import java.util.Iterator;

public class Stack implements Iterable<Integer> {
    
    int [] arr;
    int top;
   int capacity;

   public Stack(int size){
    arr=new int[size];
    capacity=size;
    top=-1;
   }

   public void push(int data)
   { 
     if(isFull()){
        throw new IllegalStateException("Stack is Full");
     }
   arr[++top]=data;

   }

  public  int pop(){
  if(isEmpty())
    {
        throw new IllegalStateException("Stack is Empty");
    }
    return arr[top--];
   }


   public boolean isEmpty(){
    return top==-1;
   }
   private boolean isFull(){
  return top==capacity-1;
   }


public int peek(){
    if(isEmpty()){
        throw new IllegalStateException("Stack is Empty");
    }
    return arr[top];
}

@Override
public Iterator<Integer> iterator() {
    
    Iterator<Integer> itr=new MyIterator(this);

return itr;
   }

}

class MyIterator implements Iterator<Integer>{
     Stack stack;
     int count=0;

     public MyIterator(Stack stack)
     {
        this.stack=stack;
     }
    @Override
    public boolean hasNext() {
        
        if(count<=stack.top)
             return true;
       return false;  
    }

    @Override
    public Integer next() {
    return this.stack.arr[count++];
    }

    
}