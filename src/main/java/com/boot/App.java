package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"com.boot","asset.pipeline.springboot"})
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(""); 
        SpringApplication.run(App.class, args);
    }
}

	
	//curl -X POST -F 'date=2014-01-01' http://localhost:9090/stats/save/2016-01-01