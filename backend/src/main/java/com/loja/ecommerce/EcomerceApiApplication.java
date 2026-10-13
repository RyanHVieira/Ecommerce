
package com.loja.ecommerce;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomerceApiApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory(".").ignoreIfMissing().load();
		String url = dotenv.get("DB_URL");
		String username = dotenv.get("DB_USERNAME");
		String password = dotenv.get("DB_PASSWORD");
		String driver = dotenv.get("DB_DRIVER");

		SpringApplication app = new SpringApplication(EcomerceApiApplication.class);

		app.setDefaultProperties(java.util.Map.of(
				"spring.datasource.url", url,
				"spring.datasource.username", username,
				"spring.datasource.password", password,
				"spring.datasource.driver-class-name", driver
		));

		app.run(args);
	}
}
