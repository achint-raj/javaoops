import java.util.*;
import static java.lang.System.exit;
public class stackusingll {
    public static void main(String args[]){
        Implementstusingll obj = new Implementstusingll();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();
        System.out.printf("\nTop element is %d\n",
                          obj.peek());
                          obj.pop();
                          obj.pop();
                          obj.display();
                          System.out.printf("\nTop element is %d\n",
                          obj.peek());
    }
}

class Implementstusingll {
    private class Node {
        int data;
        Node link;
    }
    Node top;
Implementstusingll(){
   this.top = null;
}
void push(int x){
    Node temp = new Node();
     // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data=x;
        temp.link=top;
        top=temp;

}

public boolean isEmpty() { 
    return top == null;
 }
 public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
 
        // update the top pointer to point to the next node
        top = (top).link;
    }
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.printf("%d->", temp.data);
 
                // assign temp link to temp
                temp = temp.link;
            }
        }
    }

}