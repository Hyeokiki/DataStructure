package Sorting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MyMergeSort {
	private ArrayList L1;
	private ArrayList L2;
	private Comparator comp;
	
	MyMergeSort(Comparator c){
		this.comp = c;
		
	}
	
	public void sort(ArrayList l) {
		if(l.size()<2) {
			return;
		}
		int step = 1;
		int startLeft, startRight;
		while(step < l.size()) {
			startLeft = 0;
			startRight = step;
			while(startRight+step <= l.size()) {
				Merge(l, startLeft, startLeft+step, startRight, startRight+step);
				startLeft = startRight + step;
				startRight = startLeft + step;
			}
			if(startRight< l.size()) {
				Merge(l, startLeft, startLeft+step, startRight, l.size());
			}
			step = step*2;
		}
	}
	public void Merge(ArrayList l, int startLeft, int stopLeft, int startRight, int stopRight) {
		L1 = new ArrayList();
		L2 = new ArrayList();
		for(int i = startLeft; i<stopLeft;i++) {
			L1.add(l.get(i));
		}
		for(int j = startRight; j<stopRight;j++) {
			L2.add(l.get(j));
		}
		//System.out.println(L1);
		//System.out.println(L2);
		int m = 0;
		int n = 0;
		for(int k = startLeft; k<stopRight; k++) {
			if(!L2.isEmpty()&&!L1.isEmpty()) {
				if( comp.compare(L1.get(m), L2.get(n))<=0) {
					l.set(k, L1.remove(m));
				}
				else {
					l.set(k, L2.remove(n));
				}
			}
			if(L1.isEmpty()){
				while(!L2.isEmpty()) {
					l.set(++k,L2.remove(n));
				}
			}
			if(L2.isEmpty()) {
				while(!L1.isEmpty()) {
					l.set(++k,L1.remove(n));
				}
			}
		}
	}
	
	public Comparator setComparator(Comparator c) {
		comp = c;
		return comp;
	}
}
