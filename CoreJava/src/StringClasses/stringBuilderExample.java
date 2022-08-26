package StringClasses;

public class stringBuilderExample {
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("String Builder ");  
		sb.append("is peer class of string ");//now original string is changed  
		sb.append("that provide much of functionality");
		sb.append("of string class");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("It is used to specified index position ");  
		sb1.insert(14,"insert text ");//now original string is changed  
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("This method reverse the string on which it is called");  
		sb2.reverse();  
		System.out.println(sb2);
}
}
