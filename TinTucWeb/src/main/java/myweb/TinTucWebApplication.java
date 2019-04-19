package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class TinTucWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinTucWebApplication.class, args);
	}

}
