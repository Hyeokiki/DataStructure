package week09;

import java.awt.Point;
import java.util.Comparator;

public class PointComparator2 implements Comparator {
	public int compare(Object o1, Object o2) {
		double x1 =  ((Point) o1).getX();
		double y1 =  ((Point) o1).getY();
		
		double x2 = ((Point) o2).getX();
		double y2 = ((Point) o2).getY();
		int temp;
		if((Math.sqrt(x2*x2 + y2*y2)-Math.sqrt(x1*x1 + y1*y1))>0) {
			temp=1;
		}
		else if((Math.sqrt(x2*x2 + y2*y2)-Math.sqrt(x1*x1 + y1*y1))<0) {
			temp=-1;
		}
		else {
			temp=0;
		}
		
		return temp;
		}
	
}