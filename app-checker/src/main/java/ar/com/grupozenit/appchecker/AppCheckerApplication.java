package ar.com.grupozenit.appchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AppCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCheckerApplication.class, args);
	}

}
