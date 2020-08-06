package Recursion;

public class Factorial { //팩토리얼

	// n Factorial : n!
	// 0! = 1
	// n! = n * (n-1)! (n>0)

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(4)); // 4*3*2*1 = 24
	}

}
