package ar.com.grupozenit.appchecker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private static final String template = "Bienvenido %s a la app de carga de informes";
	
	@GetMapping("/test")
	public String getStrFromApp(@RequestParam(value = "name", defaultValue = "nobody") String name) {
		return String.format(template, name);
	}

}
