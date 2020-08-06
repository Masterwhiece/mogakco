package Recursion;

public class GCD { // the Greatest Common Divisor : 최대공약수

	// 최대공약수 구하는 대표적인 알고리즘, Euclid Method 이용
	// m>=n인 두 양의 정수 m과 n에 대해서
	// m이 n의 배수이면 gcd(m,n) = n이고,
	// 그렇지 않으면 gcd(m,n) = gcd(n,m%n)

	public static double gcd(int m, int n) {
		if (m < n) { // m이 n보다 작으면 m,n을 swap
			int tmp = m;
			m = n;
			n = tmp;
		}
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}

}
