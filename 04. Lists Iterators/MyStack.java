package ListnIter;

public class MyStack {
	MyArrayList Stack = new MyArrayList();
	
	public void push(Object o) throws MyException {
		int n = Stack.size();
		Stack.add(n, o);
		if(Stack.fullcheck(n)) {
			throw new MyException("Stack�� �� á���ϴ�.\n");
		}
	}
	public Object pop() throws MyException {
		if(Stack.isEmpty()) {
			throw new MyException("Stack�� ������ϴ�.\n");
		}
		Object popobject = Stack.remove(Stack.size()-1);
		return popobject;
	}
	public Object top() throws MyException {
		Object topobject = Stack.get(Stack.size());
		
		return topobject;
	}
	public int size(){
		return Stack.size();
	}
	
	public boolean isEmpty() {
		if(Stack.isEmpty()) {
			return true;
		}
		else{
			return false;
		}
	}
}
