package refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	void testStatement() {
		Movie m1 = new Movie("Alice in Wonderland", 2);
		Movie m2 = new Movie("Wall-E", 2);

		Customer custTest = new Customer("Pennywise");

		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2, 1);

		custTest.addRental(r1);
		custTest.addRental(r2);

		String expectedStatement = "Rental Record for Pennywise\n" + "\tAlice in Wonderland\t1.5\n" + "\tWall-E\t1.5\n"
				+ "Amount owed is 3.0\n" + "You earned 2 frequent renter points";

		assertEquals(custTest.statement(), expectedStatement);

	}
}
