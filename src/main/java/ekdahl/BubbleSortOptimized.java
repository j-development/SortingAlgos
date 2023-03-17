package ekdahl;

public class BubbleSortOptimized {
	public static int[] run(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			boolean swapped = false;
			int indexOfMax = 0;
			for (int j = 1; j < length - i; j++) {
				if (array[j] > array[indexOfMax]) {
					indexOfMax = j;
				}
				if (array[j] < array[j - 1]) {
					int tempValue = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tempValue;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
			int tempValue = array[length - 1 - i];
			array[length - 1 - i] = array[indexOfMax];
			array[indexOfMax] = tempValue;
		}
		return array;
	}
}