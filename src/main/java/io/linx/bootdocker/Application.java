package io.linx.bootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lingani on 2016/09/15.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "Hello Docker World";
    }

    public static void main(String [] args){
        SpringApplication.run(Application.class, args);
    }

}
