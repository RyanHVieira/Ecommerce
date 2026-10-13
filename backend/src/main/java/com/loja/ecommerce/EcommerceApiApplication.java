
package com.loja.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EcommerceApiApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory(".").ignoreIfMissing().load();
		SpringApplication app = new SpringApplication(EcommerceApiApplication.class);

		app.setDefaultProperties(java.util.Map.of(
			"DB_URL", dotenv.get("DB_URL"),
			"DB_USERNAME", dotenv.get("DB_USERNAME"),
			"DB_PASSWORD", dotenv.get("DB_PASSWORD"),
			"DB_DRIVER", dotenv.get("DB_DRIVER")
		));
		app.run(args);
	}
}
