package ch.robotdreams.primavera;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
