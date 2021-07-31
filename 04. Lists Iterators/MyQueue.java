package ListnIter;

public class MyQueue {
	MyArrayList Queue = new MyArrayList();
	
	public void enqueue(Object o) throws MyException {
		Queue.add(Queue.size(), o);
		if(Queue.fullcheck(Queue.size())) {
			throw new MyException("Queue가 꽉 찼습니다.\n");
		}
	}
	
	public Object dequeue() throws MyException {
		if(Queue.isEmpty()) {
			throw new MyException("Queue가 비었습니다.\n");
		}
		Object o = Queue.remove(0);
		return o;
	}
	
	public Object front() throws MyException {
		Object o = Queue.get(0);
		return o;
	}
	
	public int size() {
		return Queue.size();
	}
	
	public boolean isEmpty() {
		if(Queue.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
