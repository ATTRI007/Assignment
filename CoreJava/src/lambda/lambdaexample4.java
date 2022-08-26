package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{

	String Name;

	public Person(String name) {


		this.Name=name;

	}

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {


		return "Product Name = "+ this.Name   +"\n"; 

	}

}
public class lambdaexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("ghu"),
				new Person("hjhj"),
				new Person("hjhj")
					);

			display(people, p ->  (p.getName().length() % 2) == 0  ); 




		}

		private static void display(List<Person> people,Predicate<Person> c) {
			for(Person o : people) {
				if(c.test(o))
				people.remove(o);
			}


			System.out.println(people);
	}

}
