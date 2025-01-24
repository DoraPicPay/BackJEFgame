package J.FGAME.Viviane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VivianeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VivianeApplication.class, args);
	}

}
