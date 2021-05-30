package by.epam.unit05.main;

public class Task03 {
	public static void main(String args[]) {
		int a = (int)(Math.random() * 999999);
		int b = (int)(Math.random() * 999999);
		System.out.print("a = " + a + ", b = " + b + " => ");
		System.out.println(Digits(a, b));
	}
	static String Digits(int a, int b) {
		String result = new String();
		while (a != 0 && b !=0 ) {
			a /= 10;
			b /= 10;
			if (a == 0 && b == 0) {
				result = "Одинаковое количество цифр в двух числах.";
			}
			else {
				if (b == 0) {
					result = "В первом числе цифр больше, чем во втором.";
				}
				else {
					if (a == 0) {
						result = "Во втором числе цифр больше, чем в первом.";
					}
				}
			}
		}
		return result;
	}
}
