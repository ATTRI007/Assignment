package Generic;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

 class Employee1<T, U,V> {
 HashSet<T> set1=new HashSet<T>();
 HashSet<U> set2=new HashSet<U>();
 HashSet<V> set3=new HashSet<V>();
 
 public Employee1(int i, String string, int j, int k) {
	// TODO Auto-generated constructor stub
}

public void Employee1(T id, U name, V sal)
 {
	 set1.add(id);
	 set2.add(name);
	 set3.add(sal);
 }
 
 public void displayDeatils()
 {
	 java.util.Iterator<T> i=set1.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 java.util.Iterator<U> i1=set2.iterator();
	 while(i1.hasNext()) {
		 System.out.println(i1.next());
	 }
	 java.util.Iterator<V> i2=set3.iterator();
	 while(i2.hasNext()) {
		 System.out.println(i2.next());
	 }
 }
}
public class Employee{
	public static void main(String args[]) {
		Employee1<Integer,String,Double> emp=new Employee1<Integer, String,Double>(10,"as",1445,10);
		emp.displayDeatils();
	}
}
