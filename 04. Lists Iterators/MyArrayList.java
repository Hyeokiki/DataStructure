package ListnIter;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class MyArrayList {
	private int n = 0;
	private Object [] elementData =new Object[100];
	
	public Object get(int i) throws MyException{
		if(i < 0 || i > (n-1) ) {
			throw new MyException("element가 존재하지 않는 index입니다.\n");
		}
		return elementData[i]; 
	}
	
	public Object set(int i, Object e) throws MyException{
		if(i < 0 || i > (n-1)) {
			throw new MyException("element가 존재하지 않는 index입니다.\n");
		}	
		Object temp;
		temp = elementData[i];
		elementData[i] = e;
		return temp;
	}
	
	public void add(int i, Object e) throws MyException{
		if(i<0 || i> n) {
			throw new MyException("element가 존재하지 않는 index입니다.");
		}
		if(i==elementData.length) {
			int prevsize = elementData.length;
			Object [] temparr = new Object[prevsize*2];
			for(int j = 0; j < n; j++) {
				temparr[j] = elementData[j];
			}
			elementData = new Object[prevsize*2];
			elementData = temparr.clone();
		}
		
		n++;
		if(elementData[i] != null) {
			for(int j=n-1; j<i; j--) {
				elementData[j+1] = elementData[j];
			}
			elementData[i] = e;
		}
		else {
			elementData[i] = e;
		}
	}
	
	public Object remove(int i) throws MyException {
		if(i<0 || i> (n-1)) {
			throw new MyException("element가 존재하지 않는 index입니다.");
		}
		Object temp;
		temp = elementData[i];
		for(int j=i; j<n-1; j++) {
			elementData[j] = elementData[j+1];
		}
		elementData[n-1] = null;
		n--;
		return temp;
	}
	
	public int size() {
		return n;
	}
	
	public boolean isEmpty() {
		if(n == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean fullcheck(int i) {
		if(i > elementData.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
