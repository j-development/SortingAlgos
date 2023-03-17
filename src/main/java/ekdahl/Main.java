package ekdahl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static ekdahl.Util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {


		Values.initLargeArray();
		int[] SmallArray = Values.getSmallArray();
		int[] MediumArray = Values.getMediumArray();
		int[] LargeArray = Values.getLargeArray();
		int[] AlmostSortedArray = Values.getAlmostSortedArray();

		int[] array = MediumArray;
//
//		PrintArray(array);
//		QuickSort.run(array);
//		PrintArray(array);
		System.out.println("-----Starting---------");

		for (int i = 0; i < 10; i++) {
//			randomizeArray(array);
			// Start time
			long t0 = System.nanoTime();
			QuickSort.run(array);
			// End time
			long t1 = System.nanoTime();
			long elapsedTime = t1 - t0;
			System.out.println(elapsedTime);
		}

	}

	private static void randomizeArray(int[] array) {
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	private static void createList() throws FileNotFoundException {
		ArrayList<Integer> numbers = new ArrayList<>();
		int num = 1;
		while (num < 100001) {
			numbers.add(num);
			num++;
		}
		Collections.shuffle(numbers);
		PrintWriter writer = new PrintWriter("/Users/johanekdahl/Projects/Examensarbete/SortingAlgos/SortingAlgorithms/numbers.txt");
		for (int number : numbers) {
			writer.println(number);
		}
		writer.close();
	}
}
