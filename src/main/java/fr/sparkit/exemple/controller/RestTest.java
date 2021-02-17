package fr.sparkit.exemple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spark")
public class RestTest {

	@GetMapping("")
	public String sendMessage() {
		return "<h1 style=\"text-align: center;" + "position: absolute;" + "top: 40%;" + "color: #f39797;"
				+ "left: 50%;" + "transform: translate(-50%, -40%);" + "font-size: 3rem;\"> Bonjour les Sparkiens </h1>";
	}
}
