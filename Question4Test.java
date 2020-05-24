
// Raja Hammad Mehmood
// J unit testing
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question4Test {

	@Test
	void testArea() {
		int correctarea = Question3.area(5, 5);
		assert correctarea == 25 : "Method 'correctarea' failed";
	}

	@Test
	void testArea2() {
		int wrongarea = Question3.area2(5, 5);
		assert wrongarea == 25 : "Method 'wrongarea' failed";
	}

}
