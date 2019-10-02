public class Goldbach {
	/**
	 * Checks if the number n is prime. Negative numbers and zero are declared
	 * to be non-prime.
	 * 
	 * @param n
	 *            Number to be tested.
	 * @return True if n is prime, false if not.
	 */
	public  boolean isPrime(Integer n) {
		if (n<= 0) {
			return false;
		} 
		for (int p = 2; p < n; p++) {
			if (n % p == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Checks Goldbach conjecture for n, that is, checks if the even number n
	 * can be written as the sum of two prime numbers.
	 * 
	 * If n is odd, it returs automatically true.
	 * 
	 * @param n
	 *            Number to be checked.
	 * @return True if n can be decomposed as sum of prime numbers, false if
	 *         not. Also prints the decomposition if true.
	 */
	public boolean checkGoldbach(Integer n) {
		for (int p = 1; p < n / 2; p++) {
			if (isPrime(p) && isPrime(n - p)) {
				System.out.println(n + "=" + p + " & " + (n - p));
				return true;
			}
		}

		return false;
	}
}