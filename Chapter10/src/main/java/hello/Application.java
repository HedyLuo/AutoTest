package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: hedy
 * @Date: 2022/05/03/21:19
 * @Description:
 */
@SpringBootApplication
@ComponentScan("com.course.server")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
