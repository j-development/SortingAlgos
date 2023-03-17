package ekdahl;

public class InsertionSort {
	public static int[] run(int[] array) {
		if (array.length < 1) return array; // Guard clause
		int length = array.length;

		for (int p1 = 1; p1 < length; p1++) {
			int key = array[p1];
			int p0 = p1 -1;
			while(p0 > 0 && array[p0] > key){
				array[p0 + 1] = array[p0];
				p0--;
			}
			array[p0 + 1] = key;
		}
		return array;
	}
}
