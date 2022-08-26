package StringClasses;

import java.util.ArrayList;

public class StringHeapMemory {
	public static void main(String args[]){  
		String s1="hELLO HOW U doinG";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);  
		
	  String s2="hello string";  
	  String s2upper=s2.toUpperCase();  
	  System.out.println(s2upper);
	  
	  String s3="java is astonsing language";  
	  String replaceString=s3.replaceAll("a","&");//replaces all occurrences of "a" to "&"  
	  System.out.println(replaceString);  
	  
	  System.out.println(s3.contains("collections"));//contains
	  String s4="collection";
	  String str1 = "java string pool refers to collection of strings present heap memory";  
	  System.out.println(s4.equals(str1));
	  System.out.println(str1.contains("collection"));
}
}
