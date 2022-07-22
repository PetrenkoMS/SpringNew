package SpringBoot.SpringBoot;

import SpringBoot.SpringBoot.services.FindSomeUsersServices;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Запуск приложения
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BasicConfigurator.configure(); //Для работы logger
		SpringApplication.run(Application.class, args);
	}

}
