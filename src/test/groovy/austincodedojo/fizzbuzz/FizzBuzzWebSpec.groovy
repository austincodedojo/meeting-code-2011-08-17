package austincodedojo.fizzbuzz

import geb.spock.GebSpec
import austincodedojo.fizzbuzz.pages.MainPage

class FizzBuzzWebSpec extends GebSpec {
	def "can connect to Fizz Buzzer web app"() {
		when: "I go to the Fizz Buzz web app"
		to MainPage
		
		then: "I can see the main page"
		at MainPage
	}
	
	def "fizzbuzz of 1 is 1"() {
		given: "I am at the Fizz Buzz web app main page"
		at MainPage
		
		when: "I submit the value 1"
		page.fizzbuzz(1)
		
		then: "I remain at the main page"
		at MainPage
		
		and: "the result is 1"
		expect: page.result == "1"
	}

	def "fizzbuzz of 3 is fizz"() {
		given: "I am at the Fizz Buzz web app main page"
		at MainPage
		
		when: "I submit the value 3"
		page.fizzbuzz(3)
		
		then: "I remain at the main page"
		at MainPage
		
		and: "the result is 'Fizz'"
		expect: page.result == "fizz"
	}

}
