package core.eda.transport;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TransportApplication {

	public static void main(String[] args) throws IOException, TimeoutException {

		SpringApplication.run(TransportApplication.class, args);
  }

}
