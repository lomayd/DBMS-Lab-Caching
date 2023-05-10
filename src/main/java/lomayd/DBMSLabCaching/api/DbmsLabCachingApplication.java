package lomayd.DBMSLabCaching.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DbmsLabCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbmsLabCachingApplication.class, args);
	}

}
