package Generic;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
array<Integer> g=new array<Integer>();
Integer[] a= {1,2,3,4,5,6};
Scanner sc= new Scanner(System.in);
System.out.println("Enter the position 1");
int ch=sc.nextInt();
	
	System.out.println("Enter the position 2");
	int ch1=sc.nextInt();
	g.display(a,ch,ch1);
	}
}
	class array<T> {
		public void display(T a[],int ch,int ch1) {
		T temp;
		temp=a[ch];
		a[ch]=a[ch1];
		a[ch1]=temp;
		for(int i=0; i<a.length; i++) {
			System.out.printf("%s",a[i]);
			
		}
	}
	}

