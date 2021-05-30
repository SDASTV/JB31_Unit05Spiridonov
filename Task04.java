package by.epam.unit05.main;

import java.util.Random;

public class Task04 {
	public static void main(String args[]) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		System.out.print("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%2d] ", array[i]);
		}
		System.out.println("\n");
		System.out.println("Сумма элементов массива D[1] + D[2] + D[3] = " + SumOfElements(array, 1, 3));
		System.out.println("Сумма элементов массива D[3] + D[4] + D[5] = " + SumOfElements(array, 3, 5));
		System.out.println("Сумма элементов массива D[4] + D[5] + D[6] = " + SumOfElements(array, 4, 6));
	}
	static int SumOfElements(int[] array, int k, int m) {
		int sum = 0;
		for (int i = k - 1; i <= m - 1; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}
