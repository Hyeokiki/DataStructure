package RecursiveAlgorithms;

public class prac03 {
	public long[] LinearFib(int n) {
		if(n <= 1) {
			long[] result = {n, 0};
			return result;
		}
		else {
			long[] temp = LinearFib(n-1);
			long[] result = {temp[0] + temp[1], temp[0]};
			return result;
		}
	}
	
	public void printResult(int n) {
		for(int j = 0; j< n; j++) {
			System.out.println("Fibonacci(" + (j+1) + ")번째 수열 = "+ LinearFib(j)[0]);
		}
	}

}
