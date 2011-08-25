package austincodedojo.fizzbuzz

class FizzBuzzer {

	def fizzbuzz(val) {
		def isDivisibleByThree = isDivisibleBy(val, 3)
		def isDivisibleByFive = isDivisibleBy(val, 5)
		
		if (isDivisibleByThree && isDivisibleByFive)  "fizzbuzz"
		else if (isDivisibleByThree) "fizz"
		else if (isDivisibleByFive) "buzz" 
		else val.toString()
	}
	private isDivisibleBy(val, divisor) {
		val % divisor == 0
	}

}
