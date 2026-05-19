package s3.observability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Server {

    public Server() {}

    static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
