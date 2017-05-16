package it;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vsantucc on 15/05/2017.
 */

@RestController
public class ExampleController {


    @RequestMapping("/health/check/status")
    public String status(){
        return "Status OK";
    }

    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
}
