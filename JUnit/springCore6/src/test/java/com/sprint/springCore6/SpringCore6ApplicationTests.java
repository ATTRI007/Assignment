package com.sprint.springCore6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCore6ApplicationTests {

	 MinMax b;

		@BeforeEach
		@Test
		 void initialize() {

				b = new MinMax();

		}

		@DisplayName("To Find MINMAX")
		@Test
		void testB() {


			int[] arr = {10,56,23,47};
		assertArrayEquals(new int[] {56,10},b.findMinMax(arr));

//		assertThrows(ArrayIndexOutOfBoundsException.class ,() -> b.findMinMax(arr));


		}

		@DisplayName("For Object")
		@Test
		void testM() {


			int[] arr = {10,56,23,47};
			List<Integer> li = Arrays.asList(56,10);

			assertEquals(li, b.getMinMax(arr));

		}


}


