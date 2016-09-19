package ru.tgtu.algorithms

import spock.lang.Specification

/**
 * Created by user on 19.09.16.
 */
class PrimeCircularSpec extends Specification {

	def "can create solution unit"() {
		given:
			def solution = new PrimeCircular()
		expect:
			solution != null
	}

	def "can evaluate if number is prime"() {
		given:
			def solution = new PrimeCircular()
		expect:
			solution.isPrime(n) == answer
		where:
			n	|	answer
			1	|	false
			2	|	true
			3	|	true
			4	|	false
			5	|	true
			6	|	false
			7	|	true
			8	|	false
			9	|	false
			10	|	false
			11	|	true
	}

	def "can rotate numbers"() {
		given:
			def solution = new PrimeCircular()
		expect:
			solution.rotate(a, step) == expected
		where:
			a						|	step	|	expected
			[1,2,3] as Integer[]	|	1		|	[3,1,2]
			[1,2,3] as Integer[]	|	0		|	[1,2,3]
			[1,2,3] as Integer[]	|	2		|	[2,3,1]
	}
}
