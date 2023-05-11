package cola.gradle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloGradleJinzhongApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloGradleJinzhongApplication.class, args);
        log.info("HelloGradle-jinzhong application run success ");
    }

}
