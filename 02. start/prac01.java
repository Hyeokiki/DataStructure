package RecursiveAlgorithms;

public class prac01 {
	
	public long Power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if((n % 2) == 1) {
			long y = Power(x, (n-1)/2);
			return x*y*y;
		}
		else {
			long y = Power(x, (n/2));
			return y*y;
		}
	}
	
	
	
	public void printResult(int x, int n) {
		System.out.println(x + "의 " + n + "제곱은 "+Power(x,n)+"입니다.");
	}

}
