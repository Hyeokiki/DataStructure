package week11;
import java.util.ArrayList;

public class MyHashTable {
	
	class Node {
		String key;
		String value;
		
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private ArrayList bucketArray;
	private int bucketCapacity;
	private float loadFactor= (float) 0.9; //���� load factor
	private int n; //�ؽ����̺� ����ִ� ������ ��
	
	MyHashTable(int initialCapacity){
		this.bucketCapacity = initialCapacity;
		this.bucketArray = new ArrayList<>(initialCapacity);
		for(int i = 0; i< initialCapacity ;i++) {
			this.bucketArray.add(new ArrayList());
		}
		this.n=0;
		
	}
	
	MyHashTable(int initialCapacity, float loadFactor){
		this.bucketCapacity = initialCapacity;
		this.bucketArray = new ArrayList<>(initialCapacity);
		for(int i = 0; i< initialCapacity ;i++) {
			this.bucketArray.add(new ArrayList());
		}
		this.n=0;
		this.loadFactor = loadFactor;
	}
	
	private int hashFunc(String k) {
		int h = 0;
		for(int i=0; i<k.length(); i++) {
			h += (i+2) * (int)k.charAt(i);
		}
		h = h%bucketCapacity;
		//System.out.println(h);
		return h;
	}
	private void rehash(int capacity) {
		int tempCapacity = this.bucketCapacity;
		this.bucketCapacity = capacity;
		ArrayList temp = new ArrayList<>(capacity);
		for(int i = 0; i< capacity ;i++) {
			temp.add(new ArrayList());
		}
		
		for(int j =0 ; j<tempCapacity; j++) {
			ArrayList arr = (ArrayList)bucketArray.get(j);
			for(int i=0;i< arr.size();i++) {
				Node nodeT = (Node)(arr).get(i);
				int rekey = hashFunc(nodeT.key);
				((ArrayList) temp.get(rekey)).add(nodeT);
			}
		}
		/*this.bucketArray = new ArrayList<>(capacity);
		for(int i = 0; i< capacity ;i++) {
			bucketArray.add(new ArrayList());
			bucketArray.set(i, temp.get(i));
		}*/
		this.bucketArray = temp;
		System.out.println("Rehash �Ϸ�");
		System.out.println("bucketCapacity: "+this.bucketCapacity);
	}
	public float getLoadFactor() {
		return (float)(this.n/this.bucketCapacity);
	}
	public int size() {
		return bucketArray.size();
	}
	
	public String get(String k) {
		int bucketIndex = hashFunc(k);
		ArrayList arr1 = (ArrayList) bucketArray.get(bucketIndex);
		for(int i=0;i< arr1.size();i++) {
			Node nodeT = (Node)(arr1).get(i);
			if((nodeT.key).equals(k)) {
				return nodeT.value;
			}
		}
		System.out.println();
		System.out.println("�������� �ʴ� value�Դϴ�.");
		return null;
	}
	
	public String put(String k, String v) {
		int bucketIndex = hashFunc(k);
		Node node = new Node(k,v);
		//System.out.println(bucketIndex);
		//System.out.println(bucketArray);
		ArrayList arr = (ArrayList)bucketArray.get(bucketIndex);
		if(arr.contains(node)) {
			System.out.println("�̹� �����ϴ� value�Դϴ�.");
			return null;
		}
		arr.add(node);
		//System.out.println(node.value);
		n += 1;
		
		if(this.getLoadFactor() >= this.loadFactor) {
			System.out.println("rehash����");
			this.rehash(this.bucketCapacity*2);
		}
		return null;
	}
	
	public String remove(String k) {
		if(n==0) {
			System.out.println("hash table�� ����ֽ��ϴ�.");
			return null;
		}
		int bucketIndex = hashFunc(k);
		
		ArrayList arr = (ArrayList)bucketArray.get(bucketIndex);
		for(int i = 0; i<arr.size(); i++) {
			Node tempN  = (Node)arr.get(i);
			if(((String)tempN.key).equals(k)) {
				arr.remove(i);
				this.n = this.n - 1;
			
				if(this.loadFactor*0.5>this.getLoadFactor()) {
					this.rehash((int)(bucketCapacity*0.25));
				}
				return tempN.value;
			}
		}
		
		System.out.println("key��"+ k + "�� value�� �����ϴ�.");
		return null;
	}
}
