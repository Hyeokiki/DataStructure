package RecursiveAlgorithms;

public class prac02 {
	public long BinarySum(int[] A, int i, int n) {
		if(n == 1) {
			return A[i-1];
		}
		else {
			return (BinarySum(A, i ,(int)Math.ceil((float)n/2)) + BinarySum(A, i + (int)Math.ceil((float)n/2), (n/2)));
		}
	}
	
	public void printResult(int i, int n) {
		int[] A =new int[n];
		for(int j =0; j<A.length; j++) {
				A[j] = j+1;
		}
		System.out.println(i + "부터 " + n + "까지의 합은 "+BinarySum(A,i,n)+"입니다.");
	}
}
