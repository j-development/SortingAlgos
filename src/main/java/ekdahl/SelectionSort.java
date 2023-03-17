package ekdahl;

public  class SelectionSort {

	public static int[] run(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int indexOfSmallest = i;
			for (int j = i+1; j < length; j++) {
				if(array[j] < array[indexOfSmallest]){
					indexOfSmallest = j;
				}
				j++;
			}
			switchElements(indexOfSmallest, i, array);
		}
		return array;
	}

	public static void switchElements(int index1, int index2, int[] array){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
