package week09;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPQ {
	private Comparator cpt;
	private ArrayList list;
	
	MyPQ(){
		this.list = null;
		this.cpt = null;
	}
	
	MyPQ(Comparator comp){
		this.list = new ArrayList();
		this.cpt = comp;
	}
	MyPQ(int initialCapacity, Comparator comp){
		this.list = new ArrayList(initialCapacity);
		this.cpt = comp;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public MyEntry insert(Object k, Object v) {
		MyEntry newEntry = new MyEntry(k,v);
		
		int index= 0;
		int len = list.size();
		
		for(int i=0;i<len; i++) {
			MyEntry temp = (MyEntry)list.get(i);
			if(this.cpt.compare(k, temp.getKey())>0) {
				index++;
			}
		}
		
		list.add(index, newEntry);
		return newEntry;
	}
	public MyEntry removeMin() {
		return(MyEntry)list.remove(0);
	}
	public MyEntry min() {
		return (MyEntry)list.get(0);
	}
}
