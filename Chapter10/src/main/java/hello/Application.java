package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @Author: hedy
 * @Date: 2022/05/03/21:19
 * @Description:
 */
@EnableOpenApi
@SpringBootApplication
@ComponentScan("com.course")
//https://blog.csdn.net/shl1285067785/article/details/121933879
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
