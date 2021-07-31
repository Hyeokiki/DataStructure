package week09;

import java.awt.Point;
import java.util.Comparator;

public class main {
	public static void main(String[] args) {
		IntComparator com = new IntComparator();
		MyPQ pq = new MyPQ(com);
		
		pq.insert(new Integer(30), null);
		pq.insert(new Integer(10), null);
		pq.insert(new Integer(20), null);
		System.out.println("===========실습 1============");
		System.out.println((Integer)pq.removeMin().getKey());
		System.out.println((Integer)pq.removeMin().getKey());
		System.out.println((Integer)pq.removeMin().getKey());
		
		System.out.println("===========실습 2============");
		PointComparator com2 = new PointComparator();
		MyPQ pq2 = new MyPQ(com2);
		pq2.insert(new Point(5, 4), "a");
		pq2.insert(new Point(2, 7), "b");
		pq2.insert(new Point(9, 5), "c");
		pq2.insert(new Point(3, 1), "d");
		pq2.insert(new Point(7, 2), "e");
		pq2.insert(new Point(9, 7), "f");
		pq2.insert(new Point(1, 4), "g");
		pq2.insert(new Point(4, 3), "h");
		pq2.insert(new Point(8, 2), "i");
		pq2.insert(new Point(4, 8), "j");
		
		int size = pq2.size();
		System.out.println("[가까운 순서]");
		for(int i=0 ; i<size ; i++) {
			System.out.println(pq2.min().getValue()+"("+(int)((Point) pq2.min().getKey()).getX()+","
		+(int)((Point) pq2.removeMin().getKey()).getY() +")");
		}
		System.out.println();
		PointComparator2 com3 = new PointComparator2();
		MyPQ pq3 = new MyPQ(com3);
		pq3.insert(new Point(5, 4), "a");
		pq3.insert(new Point(2, 7), "b");
		pq3.insert(new Point(9, 5), "c");
		pq3.insert(new Point(3, 1), "d");
		pq3.insert(new Point(7, 2), "e");
		pq3.insert(new Point(9, 7), "f");
		pq3.insert(new Point(1, 4), "g");
		pq3.insert(new Point(4, 3), "h");
		pq3.insert(new Point(8, 2), "i");
		pq3.insert(new Point(4, 8), "j");
		System.out.println("[멀리 있는 순서]");
		int size2 = pq3.size();
		for(int i=0 ; i<size2 ; i++) {
			System.out.println(pq3.min().getValue()+"("+(int)((Point) pq3.min().getKey()).getX()+","
		+(int)((Point) pq3.removeMin().getKey()).getY() +")");
		}
	}
	
}
