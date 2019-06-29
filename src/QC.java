class CharNode{

char ch;

CharNode next;

public CharNode(char ch, CharNode node)

{

this.ch=ch;

this.next=node;

}

}

 

class Queue

{

private CharNode head;

private CharNode tail;

private int size;

public void enqueue(char ch)

{

if(size==10)

{

System.out.println("Error! already 10 elements are present in the queue!.");

return;

}

if(head==null)

{

head=new CharNode(ch, null);

tail=head;

}

else {

tail.next=new CharNode(ch, null);

tail=tail.next;

}

size++;

}

public char dequeue() throws Exception

{

if(size==0)

throw new Exception("Queue Underflow!");

CharNode node=head;

head=head.next;

size--;

return node.ch;

}

public void printQueue()

{

CharNode temp=head;

while(temp!=null)

{

System.out.print(temp.ch+" ");

temp=temp.next;

}

System.out.println();

}

}

 

public class QC {

public static void main(String[] args) throws Exception {

Queue q=new Queue();

q.enqueue('a');

q.enqueue('b');

q.enqueue('c');

System.out.println("The queue is: ");

q.printQueue();

q.dequeue();

System.out.println("The queue after dequeue operation is: ");

q.printQueue();

}

}