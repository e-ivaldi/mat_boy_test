import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.somethingelse.controllers"})
public class Application {

    public static void main(final String... args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }

}