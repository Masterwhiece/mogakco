package Recursion;

public class Power { //°ÅµìÁ¦°ö

	// x^n
	// x^0 = 1
	// x^n = x * x^(n-1)

	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(power(2, 3)); // 2*2*2 = 8
	}
}
