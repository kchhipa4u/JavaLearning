package day10.controlflow;

public class LabeledBreakDemo {
	public static void main(String[] args) {

		myFirstForLoop: // Labeled outer loop
		for (int i = 0; i < 3; i++) {
			System.out.println("outer i= " + i);

			innerForLoop: // Labeled inner loop
			for (int j = 0; j < 3; j++) {
				if (j > 0) {
					break myFirstForLoop;
				}
				System.out.println("inner i= " + i + ", j= " + j);
			} // end inner loop
		} // end outer loop

	}
}