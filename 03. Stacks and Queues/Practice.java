package Stack;

import java.util.Scanner;

public class Practice {
	//실습과제2
	public void prac02() {
		Stack stack = new ArrayStack();
		Scanner scan =new Scanner(System.in);
		
		String expression;
		System.out.println("역순으로 변환할 수식을 입력하세요.");
		expression = scan.next();
		char PUT;
		char POP;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<expression.length();i++) {
			if((expression.substring(i,i+1)).charAt(0) == '(') {
				PUT = ')';
			}
			else if((expression.substring(i,i+1)).charAt(0) == ')') {
				PUT = '(';
			}
			else {
				PUT = (expression.substring(i,i+1)).charAt(0);
			}
			stack.push(PUT);
		}
		for(int i=0;i<expression.length();i++) {
			POP = stack.pop();
			sb.append(POP);
		}
			String fixedexpression = sb.toString();
			System.out.println(fixedexpression);
			scan.close();
	}
	//실습과제3
	public void prac03() {
		Queue queue = new StackQueue();
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('c');
		queue.enqueue('d');
		queue.enqueue('e');
		for(int i=0;i<3;i++) {
			queue.dequeue();
		}
		queue.enqueue('f');
		queue.enqueue('g');
		queue.enqueue('h');
		queue.enqueue('i');
		queue.enqueue('j');
		for(int i=0;i<3;i++) {
			queue.dequeue();
		}
		queue.enqueue('k');
		queue.enqueue('l');
		queue.enqueue('m');
		queue.enqueue('n');
		queue.enqueue('o');
		for(int i=0;i<6;i++) {
			queue.dequeue();
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		
	}
}
