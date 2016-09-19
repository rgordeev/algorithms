package ru.tgtu.algorithms;

/**
 *
 * A number is called a circular prime if it is prime and all of its rotations are primes.
 *
 * For example, the number 197 has two rotations: 971, and 719.  Both of them are prime.
 * Another example: 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below N?
 *
 * 1 <= N <= 1000000
 *
 * Do not solve the task using a built-in function that can accomplish the whole task on its own.
 *
 * Test Cases
 *
 * There are 0 circular primes below 1.
 * There are 4 circular primes below 10.
 * There are 13 circular primes below 100.
 * There are 25 circular primes below 1000.
 * There are 33 circular primes below 10000.
 * There are 43 circular primes below 100000.
 * There are 55 circular primes below 1000000.
 *
 */
public class PrimeCircular {
	public Boolean isPrime(Integer n) {
		if (n <= 1) return false;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0) return false;
		return true;
	}

	public Integer[] rotate(Integer[] a, Integer step) {
		int m = a.length;
		step = step % m;

		Integer[] result = new Integer[m];
		for (int i = 0; i < m; i++)
			result[i] = a[(i + m - step) % m];
		return result;
	}

}
