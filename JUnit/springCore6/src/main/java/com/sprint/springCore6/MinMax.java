package com.sprint.springCore6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMax {
	int[] findMinMax(int[] a ) {


		int[] c = new int[2];

		 c[0] = Arrays.stream(a).max().getAsInt();

		 c[1] = Arrays.stream(a).min().getAsInt();


		return c;
	}

	
	public List<Integer> getMinMax(int[] a){

		List<Integer> li = new ArrayList();

		li.add(Arrays.stream(a).max().getAsInt());

		li.add(Arrays.stream(a).min().getAsInt());



		return li;


	}


}

