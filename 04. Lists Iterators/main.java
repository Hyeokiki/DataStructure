package ListnIter;



public class main {
	public static void main(String[] args) {
		MyStack prac02_1 = new MyStack();
		MyQueue prac02_2 = new MyQueue();
		try {

			System.out.println("실습2-1)");
			for(int i = 0; i<10; i++) {
				prac02_1.push(i+1);
			}
			
			for(int i =0; i<10 ; i++) {
				System.out.println(prac02_1.pop());
			}
			System.out.println("실습2-2)");
			
			for(int i = 0; i<10; i++) {
				prac02_2.enqueue(i+1);
			}
			
			for(int i =0; i<10 ; i++) {
				System.out.println(prac02_2.dequeue());
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
