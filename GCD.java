package Recursion;

public class GCD { // the Greatest Common Divisor : �ִ�����

	// �ִ����� ���ϴ� ��ǥ���� �˰���, Euclid Method �̿�
	// m>=n�� �� ���� ���� m�� n�� ���ؼ�
	// m�� n�� ����̸� gcd(m,n) = n�̰�,
	// �׷��� ������ gcd(m,n) = gcd(n,m%n)

	public static double gcd(int m, int n) {
		if (m < n) { // m�� n���� ������ m,n�� swap
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
