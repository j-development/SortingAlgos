package ekdahl;

public class BubbleSort {
	public static int[] run(int[] array) {
		if (array.length < 1) return array; // Guard clause

		int length = array.length;
		for (int i = 0; i < length; i++) {
			int highIndex = 0; // Index of the current highest integer element
			for (int j = 1; j < (length - i); j++) {
				if (array[j] > array[highIndex]) {
					highIndex = j;
				}
			}
			int temp = array[length - (1 + i)];
			array[length - (1 + i)] = array[highIndex];
			array[highIndex] = temp;
		}
		return array;
	}
}


