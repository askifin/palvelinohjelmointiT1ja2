package s22.helloPasila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="name", required=false, defaultValue="Mörkö") String nimi,
		@RequestParam(name="location", required=false, defaultValue="Muumilaakso") String paikka) {
		return "Hei " + nimi + " joka koti on " + paikka;
	}
	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "Tämä on indeksin teksti";
	}
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "Tämä on contactin teksti";
	}
	
}

//sisältää molemmat teht 1 ja 2