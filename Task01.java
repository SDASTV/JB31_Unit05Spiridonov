package by.epam.unit05.main;

public class Task01 {
	public static void main(String args[]) {
		int a = (int)(Math.random() * 999);
		int b = (int)(Math.random() * 999);
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("NOD = " + NOD(a, b) + ", NOK = " + NOK (a, b));
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
