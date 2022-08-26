package Elevenfeatures;

import java.util.ArrayList;
import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lia = new ArrayList();
		lia.add("A");
		lia.add("Quick");
		lia.add("Brown");
		lia.add("Fox");
		lia.add("Jumps");
		lia.add("Over");
		lia.add("The");
		lia.add("Lazy");
		lia.add("Dog");


//		String[] result = lia.stream().toArray(String[] :: new);
		String[] res = lia.toArray(new String[lia.size()]);

		System.out.println(Arrays.toString(res));	
	}

}
