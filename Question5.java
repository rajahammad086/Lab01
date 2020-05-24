
/* Author: Chris Fietkiewicz
 Based on an example from https://stackoverflow.com/questions/3228427/redirect-
system-out-println
 Overrides System.out.println() for two purposes: (1) To demonstrate @Override. (2)
To hijack the output.
//Raja Hammad Mehmood
// Using override with increment and using a method that gives a compiler error.
*/
import java.io.PrintStream;
import java.io.OutputStream;

public class Question5 {
	// Interceptor class contains new version of println() to be used with
//System.out.
	static class Interceptor extends PrintStream {
		public Interceptor(OutputStream out) {
			super(out, true);
		}

		int increment = 0;

		public static void printHistogram(int low, int high) {
			for (int count = low; count < high; count++) {
				System.out.print(count + " :  ");
			}
		}

		// Override println() for given OutputStream by prepending "Received:"
		@Override

		public void println(String s) {
			super.println(increment + ":" + "Hardwork, unity, discipline" + s);
			increment++;
		}
	}

	public static void main(String[] args) {
		PrintStream origOut = System.out;
		PrintStream interceptor = new Interceptor(origOut);
		System.setOut(interceptor);
		System.out.println(""); // Output should be modified
		System.out.println(" emma is awesome");
		System.out.println(" so is Raja");
		System.out.println(" so is Brayan");
		System.out.printHistogram(3, 4);
	}
}