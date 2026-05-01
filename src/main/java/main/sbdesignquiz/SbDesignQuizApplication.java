package main.sbdesignquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbDesignQuizApplication {

    static {
        io.github.cdimascio.dotenv.Dotenv dotenv = io.github.cdimascio.dotenv.Dotenv.load();
        System.setProperty("MAIL_ADDRESS", dotenv.get("MAIL_ADDRESS"));
        System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SbDesignQuizApplication.class, args);
    }

}
