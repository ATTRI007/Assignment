package StringClasses;

public class StringLen {
	public static void main(String args[]){  
		/*String s1="VARTIKA";  
		String s2="CHOUDHARY";  
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length()); 
		}*/
	
	 String str = "hello World";  
        if(str.length()>0) {  
            System.out.println("String is not empty and length is: "+str.length());  
        }  
        str = "";  
        if(str.length()==0) {  
            System.out.println("String is empty now: "+str.length());  
        }  

	}
}
