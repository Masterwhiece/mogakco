package Recursion;

public class Fibonacci {

	// f0 = 0
	// f1 = 1
	// fn = f(n-1) + f(n-2)

	public static int fibonacci(int n) {
		if (n < 2)
			return n;
		else
			return (fibonacci(n - 1) + fibonacci(n - 2));
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(4));
		// f4 = f3 + f2
		// = (0 + 1 + 1) + ( 0 + 1) = 3
	}
}
