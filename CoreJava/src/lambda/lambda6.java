package lambda;

import java.util.Arrays;
import java.util.List;

public class lambda6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
				"mathu",
				"priya",
				"tina"
					);

			list.replaceAll(s -> s.toUpperCase());


			System.out.println(list);
	}

}
