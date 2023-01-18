package com.example.springvelocitydemo2;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class SpringVelocityDemo2Application {


    public static void main(String[] args) {

        //Set up velocity
        Properties p = new Properties();
        p.setProperty("resource.loader", "file");
        p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
        p.setProperty("file.resource.loader.path", "src/main/webapp/templates");
        Velocity.init(p);

        SpringApplication.run(SpringVelocityDemo2Application.class, args);
    }

}
