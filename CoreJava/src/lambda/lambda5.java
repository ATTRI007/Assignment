package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambda5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList(
				"mathu",
				"priya",
				"tina"
					);

			StringBuilder sb = new StringBuilder();

			for(String s : li) {
				sb.append(s.charAt(0));
			}

			Consumer<StringBuilder> con = p -> System.out.println(p);

			con.accept(sb);





		}
	}


