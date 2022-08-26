package Generic;

import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pair <String ,String> p=new Pair<String, String>(" 1 "," isshu");
Date d1=new Date();
Pair<String, Date>p1=new Pair<String, Date>("1",d1);
p.display();
p1.display();
	}

}
class Pair<T,U>{
	T key;
	U value;
	public Pair(T Key, U Value) {
		key=Key;
		value=Value;
	}
	public void display() {
		System.out.println("key is" + this.key+" value is"+ this.value);
	}
}
