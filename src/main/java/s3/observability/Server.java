package s3.observability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Server {

    public Server() {}

    static void main(String[] args) {
        IO.println("Starting s3-observability server...");
        SpringApplication.run(Server.class, args);
    }
}
