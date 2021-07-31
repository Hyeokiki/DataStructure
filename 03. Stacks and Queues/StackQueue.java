package Stack;

public class StackQueue implements Queue {
	Stack inStack = new ArrayStack();
	Stack outStack = new ArrayStack();
	@Override
	public int size() {
		int temp = inStack.size() + outStack.size();
		return temp;
	}
	@Override
	public boolean isEmpty() {
		if(inStack.isEmpty()&outStack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public char front() {
		if(outStack.isEmpty()) {
			for(int i=0; i<inStack.size();i++) {
				outStack.push(inStack.pop());
			}
			return outStack.top();
		}
		else {
			return outStack.top();
		}
	}
	@Override
	public void enqueue(char o) {
		inStack.push(o);
	}
	@Override
	public char dequeue() {
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
			return outStack.pop();
		}
		else {
			return outStack.pop();
		}
		
	}

}
