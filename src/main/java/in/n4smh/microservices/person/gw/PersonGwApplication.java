package in.n4smh.microservices.person.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "in.n4smh.microservices")
public class PersonGwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonGwApplication.class, args);
	}
	
}
