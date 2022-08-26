package StringClasses;

public class stringBufferExample {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("String Buffer ");  
		sb.append("is peer class of string ");//now original string is changed  
		sb.append("that provide much of functionality");
		sb.append("of string class");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("It is used to specified index position ");  
		sb1.insert(14,"insert text ");//now original string is changed  
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("This method reverse the string on which it is called");  
		sb2.reverse();  
		System.out.println(sb2);
}
}