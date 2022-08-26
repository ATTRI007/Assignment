package Collection;
import java.util.*;    
class contacts {    
	long phoneno;
	String name; 
	String email; 
	String gender ;
	public contacts(long phoneno, String name, String email, String gender) {
		super();
		this.phoneno = phoneno;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public long getPhoneno() {
		return phoneno;
	}
	@Override
	public String toString() {
		return "contacts [phoneno=" + phoneno + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of contacts   
    Map<Long,contacts> map=new TreeMap<Long,contacts>();    
    //Creating contacts   
    contacts c1=new contacts(65877988 , " vartika"," ddahfjaja@jgj", "f");    
    contacts c2=new contacts(102870899, " isha","gsgshjkj@gjg8","f");    
    contacts c3=new contacts(672367678,"vishal","ffhgfag@gh","m");    
    //Adding Books to map   
    map.put((long) 65877988,c1);  
    map.put((long) 102870899,c2);  
    map.put((long) 672367678,c3);  
      
    //Traversing map  
    for(Map.Entry<Long, contacts> entry:map.entrySet()){    
        Long key=entry.getKey();  
        contacts c=entry.getValue();  
        System.out.println(key+" Details:"); //keys are printing 
        System.out.println(c.phoneno+" "+c.name+" "+c.email+" "+c.gender);  
        
        
    }  
    System.out.println("The values are: "// print only values
            + map.values());
    System.out.println("descendingMap: "+((TreeMap<Long, contacts>) map).descendingMap());  
    
}



}    