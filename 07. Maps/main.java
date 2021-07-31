package week11;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		System.out.println("===============실습 1 ==============");
		
		StudentInfo student1 = new StudentInfo("201711430", "June1");
		StudentInfo student2 = new StudentInfo("201711431", "June2");
		StudentInfo student3 = new StudentInfo("201711432", "June3");
		StudentInfo student4 = new StudentInfo("201711433", "June4");
		StudentInfo student5 = new StudentInfo("201711434", "June5");
		StudentInfo student6 = new StudentInfo("201711435", "June6");
		StudentInfo student7 = new StudentInfo("201711436", "June7");
		StudentInfo student8 = new StudentInfo("201711437", "June8");
		StudentInfo student9 = new StudentInfo("201711438", "June9");
		StudentInfo student10 = new StudentInfo("201711439", "June10");
		
		MyHashTable hashtable1 = new MyHashTable(13, (float)0.9);
		hashtable1.put(student1.getStudentID(), student1.getStudentName());
		hashtable1.put(student2.getStudentID(), student2.getStudentName());
		hashtable1.put(student3.getStudentID(), student3.getStudentName());
		hashtable1.put(student4.getStudentID(), student4.getStudentName());
		hashtable1.put(student5.getStudentID(), student5.getStudentName());
		hashtable1.put(student6.getStudentID(), student6.getStudentName());
		hashtable1.put(student7.getStudentID(), student7.getStudentName());
		hashtable1.put(student8.getStudentID(), student8.getStudentName());
		hashtable1.put(student9.getStudentID(), student9.getStudentName());
		hashtable1.put(student10.getStudentID(), student10.getStudentName());
		
		System.out.println("학생 1의 이름 : " + hashtable1.get(student1.getStudentID()));
		System.out.println("학생 2의 이름 : " + hashtable1.get(student2.getStudentID()));
		System.out.println("학생 3의 이름 : " + hashtable1.get(student3.getStudentID()));
		System.out.println("학생 4의 이름 : " + hashtable1.get(student4.getStudentID()));
		System.out.println("학생 5의 이름 : " + hashtable1.get(student5.getStudentID()));
		System.out.println("학생 6의 이름 : " + hashtable1.get(student6.getStudentID()));
		System.out.println("학생 7의 이름 : " + hashtable1.get(student7.getStudentID()));
		System.out.println("학생 8의 이름 : " + hashtable1.get(student8.getStudentID()));
		System.out.println("학생 9의 이름 : " + hashtable1.get(student9.getStudentID()));
		System.out.println("학생 10의 이름 : " + hashtable1.get(student10.getStudentID()));
		
		System.out.println("===============실습 2 ==============");
		StudentInfo student11 = new StudentInfo("201711440", "June11");
		StudentInfo student12 = new StudentInfo("201711441", "June12");
		StudentInfo student13 = new StudentInfo("201711442", "June13");
		StudentInfo student14 = new StudentInfo("201711443", "June14");
		StudentInfo student15 = new StudentInfo("201711444", "June15");
		
		hashtable1.put(student11.getStudentID(), student11.getStudentName());
		hashtable1.put(student12.getStudentID(), student12.getStudentName());
		hashtable1.put(student13.getStudentID(), student13.getStudentName());
		hashtable1.put(student14.getStudentID(), student14.getStudentName());
		hashtable1.put(student15.getStudentID(), student15.getStudentName());
		System.out.println();
		System.out.println("학생 11의 이름 : " + hashtable1.get(student11.getStudentID()));
		System.out.println("학생 12의 이름 : " + hashtable1.get(student12.getStudentID()));
		System.out.println("학생 13의 이름 : " + hashtable1.get(student13.getStudentID()));
		System.out.println("학생 14의 이름 : " + hashtable1.get(student14.getStudentID()));
		System.out.println("학생 15의 이름 : " + hashtable1.get(student15.getStudentID()));
	}
}
