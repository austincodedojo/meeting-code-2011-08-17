package austincodedojo.fizzbuzz.pages

import geb.Page

class MainPage extends Page {
	static url = "/" 
	static at = { title == "FizzBuzz for Ultimate Glory!" }
	static content = {
		fizzform { $("form", name:"fizzform") }
		result { $("div#fizzAnswer").text()}
		submitButton { $("input", name: "submit1")}
	}
	
	def fizzbuzz(val)
	{
		fizzform.number = val
		submitButton.click()
	}
	
}
