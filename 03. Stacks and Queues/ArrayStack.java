package Stack;

public class ArrayStack implements Stack {
	
	int t = -1;
	char[] stackarr = new char[100];
	@Override
	public int size() {
		return t+1;
	}
	@Override
	public boolean isEmpty() {
		if(t<0) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public char top(){
		if(isEmpty()) {
			System.out.println("stack이 비었습니다.");
			return 0;
		}
		else {
			return stackarr[t];
		}
		
	}
	@Override
	public char push(char o){
		if(t == 99) {
			System.out.println("stack이 꽉 찼습니다.");
			return 0;
		}
		else {
			t++;
			stackarr[t] = o;
			return o;
		}
	}
	@Override
	public char pop(){
		if(isEmpty()) {
			System.out.println("stack이 비었습니다.");
			return 0;
		}
		else {
			char o = stackarr[t];
			stackarr[t] = 0;
			t--;
			return o;
		}
	}

	

}




