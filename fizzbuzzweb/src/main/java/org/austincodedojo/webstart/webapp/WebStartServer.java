package org.austincodedojo.webstart.webapp;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import austincodedojo.fizzbuzz.FizzBuzzer;

import com.sun.jersey.api.representation.Form;

@Path("/")
public class WebStartServer {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello() {
		return pageContents("1");
	}

	private String pageContents(String result) {
		return "<html><head><title>FizzBuzz for Ultimate Glory!</title></head>" +
				"<body><form name='fizzform'>" +
				"<input method='post' name='number'></input>" +
				"<input type='submit' name='submit1'/>" +
				"</form></body>" +
				"<div id='fizzAnswer'>" + result + "</div>" +
				"</html>";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String submit(Form fizzform) {
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		
		String result = fizzBuzzer.fizzbuzz(fizzform.get("number", Integer.class)).toString();
		return pageContents(result);
	}	
}
