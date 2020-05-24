// Raja Hammad Mehmood
// Uses assert statements
public class Question3 {

	public static void main(String[] args) {
		int correctarea = area(5, 5);
		assert correctarea == 25 : "Method 'correctarea' failed";
		int wrongarea = area2(5, 5);
		assert wrongarea == 25 : "Method 'wrongarea' failed";

	}

	/**
	 * calculates area
	 * 
	 * @param 1 is length
	 * @param 2 is width
	 */
	public static int area(int length, int width) {
		return (length * width);
	}

	/**
	 * calculates the wrong area
	 * 
	 * @param 1 is length
	 * @param 2 is width
	 */
	public static int area2(int length, int width) {
		return ((length * width) + 2);
	}
}
