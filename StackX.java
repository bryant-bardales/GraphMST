package GraphMST;

class StackX
{
private int maxSize;        // size of stack array
private long[] stackArray;
private int top;            // top of stack
//--------------------------------------------------------------
public StackX(int s)         // constructor
   {
   maxSize = s;             // set array size
   stackArray = new long[maxSize];  // create array
   top = -1;                // no items yet
   }
//--------------------------------------------------------------
public void push(long j)    // put item on top of stack
   {
   stackArray[++top] = j;     // increment top, insert item
   }
//--------------------------------------------------------------
public long pop()           // take item from top of stack
   {
   return stackArray[top--];  // access item, decrement top
   }
//--------------------------------------------------------------
public long peek()          // peek at top of stack
   {
   return stackArray[top];
   }
//--------------------------------------------------------------
public boolean isEmpty()    // true if stack is empty
   {
   return (top == -1);
   }
//--------------------------------------------------------------
public boolean isFull()     // true if stack is full
   {
   return (top == maxSize-1);
   }
//--------------------------------------------------------------
public void displayStack()
{
	while( !(isEmpty()) )     // until it's empty,
	{                             // delete item from stack
		long value = pop();
		System.out.print(value);      // display it
		System.out.print(" ");
	}  // end while
}
//--------------------------------------------------------------
public void displayEven()
{
	while( !(isEmpty()) )     // until it's empty,
	{                             // delete item from stack
		long even = pop();
		
		if (even % 2 == 0)
		{
		System.out.print(even);      // display it
		System.out.print(" ");
		}
		
	}  // end while
}
//--------------------------------------------------------------
public void displayOdd()
{
	while( !(isEmpty()) )     // until it's empty,
	{                             // delete item from stack
		long even = pop();
		
		if (!(even % 2 == 0))
		{
		System.out.print(even);      // display it
		System.out.print(" ");
		}
		
	}  // end while
}
}  // end class StackX
