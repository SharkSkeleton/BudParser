package com.mishka.org.server;

import com.mishka.org.server.parser.WebParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BudParserServerApplication {

    //Start point
    public static void main(String[] args) {
        SpringApplication.run(BudParserServerApplication.class, args);
        new WebParser().parseWiki();
    }

}
