package austincodedojo.fizzbuzz

import spock.lang.Specification;

class FizzBuzzSpec extends Specification {
	def fizzbuzzer = new FizzBuzzer()
	
	def "check fizzbuzz"() {
		expect: fizzbuzzer.fizzbuzz(number) == expected
		
		where:
		number | expected
		 1     | "1"
		 2     | "2"
		 3     | "fizz"
		 5     | "buzz"
		 6	   | "fizz"
		10     | "buzz"
		15     | "fizzbuzz"
	
	}
}
