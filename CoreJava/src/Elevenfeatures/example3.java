package Elevenfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList(
				"vartika",
				"Ishu",
				"Aadi"
					);

			StringBuilder sb = new StringBuilder();

			for(String s : li) {
				sb.append(s.charAt(0));
			}

			Consumer<StringBuilder> con = p -> System.out.println(p);

			con.accept(sb);
	}

}
