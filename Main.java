import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("Here's an ArrayList of ints: " + numbers);

		System.out.println("-----");

		ArrayList<Double> temperatures = new ArrayList<Double>();
		temperatures.add(98.6);
		temperatures.add(96.5);
		temperatures.add(0, 102.5);
		temperatures.add(97.3);
		temperatures.add(99.2);
		System.out.println("Temperature @ index 0: " + temperatures.get(0));

		System.out.println("-----");

		ArrayList<String> roster = new ArrayList<String>();
		roster.add("Nicki Minaj");
		roster.add("Bad Bunny");
		roster.add("Olivia Rodrigo");
		System.out.println("APCS class roster: " + roster);

		System.out.println("Number of students: " + roster.size());

		System.out.println("Element @ index 1: " + roster.get(1));

		roster.set(1, "Benito Antonio Martínez Ocasio");
		System.out.println("Real names of the students: " + roster);

		roster.remove("Nicki Minaj");
		System.out.println("Someone dropped the class! Updated roster: " + roster);

		System.out.println("Final size of roster: " + roster.size());
		System.out.println("Length of Bad Bunny's real name: " + roster.get(0).length());
   }
}
