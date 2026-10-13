
package com.loja.ecommerce;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory(".").ignoreIfMissing().load();

		SpringApplication app = new SpringApplication(EcommerceApiApplication.class);

		app.setDefaultProperties(java.util.Map.of(
				"spring.datasource.url", dotenv.get("DB_URL"),
				"spring.datasource.username", dotenv.get("DB_USERNAME"),
				"spring.datasource.password", dotenv.get("DB_PASSWORD"),
				"spring.datasource.driver-class-name", dotenv.get("DB_DRIVER")
		));

		app.run(args);
	}
}
