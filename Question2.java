// Raja Hammad Mehmood
// using try and catch
public class Question2 {

	public static void main(String[] args) {
		int[][] M1 = {{1, 2}, {3, 4}}; // 2-by-2 with determinant
		determinant(M1);
		int[][] M2 = {{1}, {2}}; // 2-by-1 with NO determinant
		determinant(M2);
	}
	/**
     *receives a 2-dimensional array and attempts to calculate the determinant using “try” and “catch”
     *@param 1 is a 2d array of positive number
     */
    public static void determinant(int M[][] ) {
    	try {
    	    double determinant = M[0][0]*M[1][1] - M[0][1]*M[1][0];
    	    System.out.println("The determinant of M is " + determinant);
    	}
    	catch ( ArrayIndexOutOfBoundsException e ) {
    	   System.out.println("M is the wrong size to have a determinant.");
    	   e.printStackTrace();
    	}
        }
}
