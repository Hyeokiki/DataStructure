package Sorting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {
	public static void main(String[] args) {
		ArrayList randomArr = new ArrayList();
		Random RD = new Random();
		for(int i=0;i<20; i++) {
			randomArr.add(RD.nextInt(100)+1);
		}
		System.out.println("#실습 2-1)");
		System.out.println("정렬 전 : ");
		System.out.println(randomArr);
		IntComparator icomp = new IntComparator();
		MyMergeSort MS1 = new MyMergeSort(icomp);
		MS1.sort(randomArr);
		System.out.println("정렬 후 : ");
		System.out.println(randomArr);
		
		System.out.println();
		System.out.println("#실습 2-2)");
		StringComparator scomp = new StringComparator();
		MyMergeSort MS2 = new MyMergeSort(scomp);
		String t = "In computer science, a data structure is a data organization, management, and storage format "
				+ "that enables efficient access and modification. More precisely, a data structure is a collection"
				+ " of data values, the relationships among them, and the functions or operations that can be applied"
				+ " to the data.";
		//System.out.println(t);
		t=t.replace(",", "");
		t=t.replace(".", "");
		String[] str1 = t.split(" ");
		ArrayList str2 = new ArrayList();
		System.out.println("정렬 전 : ");
		for(int i=0; i<str1.length ; i++) {
			str2.add(str1[i]);
		}
		System.out.println(str2);
		MS2.sort(str2);
		System.out.println("정렬 후 : ");
		System.out.print(str2);
	}
	
	public static class IntComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return (int)o1-(int)o2;
		}
	}
	
	public static class StringComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			return ((String) o1).compareToIgnoreCase((String)o2);
		}
	}
	
}


