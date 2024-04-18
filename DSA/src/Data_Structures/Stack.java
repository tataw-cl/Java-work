//Stack implementation in Java
package Data_Structures;

public class Stack {
	protected int value;
	protected final int size = 6;
	protected int [] stack=new int[size];
	protected int top=-1;
	private boolean IsEmpty() {
if(top==-1) {
	return true;
} 
else{
	return false;
}
}

private boolean IsFull(){
	if (top==size-1) {
		return true;
	}
	else{
		return false;
	}
}

void push(int x){
	if (IsFull()) {
		System.out.println("The stack is already full");
	}
	else{
		stack[++top]=x;
	}
}

private int pop(){
	if (IsEmpty()) {
		System.out.println("The stack is already empty");
		return -99999;
	}
	else{
		value=stack[top];
		top=top-1;
		return value;
	}
}

private int peek(){ //function for peeking. It's basically the same as popping, but without reducing the value of the top
   if (!IsEmpty()){
    value=stack[top]; //returns the value in "top"
    return value;
   }
    else{
        return -99999;
    }
}


public void PrintS() {
    System.out.println("The stack members are as follows:");
    for(int i = 0; i <= top; i++){
        System.out.printf("Element at index %d: %d\n", i, stack[i]);
    }
}

public static void main(String[] args){
	Stack myStack = new Stack();
	myStack.push(20);
	myStack.push(50);
	myStack.push(15);
	myStack.push(78);
	myStack.push(33);
	myStack.push(19);
	myStack.PrintS();
	// System.out.println(myStack.stack[myStack.top+1]);
	// System.out.printf("\n\n\n%d",myStack.top+1);

}
}