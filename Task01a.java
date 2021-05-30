package by.epam.unit05.main;

public class Task01a {
	public static void main(String args[]) {
		int[][] array = new int[10][10];
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				array[a][b] = NOD(a + 1, b + 1);
			}
		}
		System.out.println("NOD:\n");
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				System.out.printf("[%2d] ", array[a][b]);
			}
			System.out.println();
		}
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				array[a][b] = NOK(a + 1, b + 1);
			}
		}
		System.out.println();
		System.out.println("NOK:\n");
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				System.out.printf("[%2d] ", array[a][b]);
			}
			System.out.println();
		}
	}

	static int NOD(int a, int b) {
		int min;
		int nod = 0;
		if (a > b)
			min = b;
		else
			min = a;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				if (i > nod)
					nod = i;
			}
		}
		return nod;
	}
	static int NOK(int a, int b) {
		int nok = 0;
		int i = 1;
		while (nok == 0) {
			if (i % a == 0 && i % b == 0) {
				nok = i;
			}
			i++;
		}
		return nok;
	}
}
