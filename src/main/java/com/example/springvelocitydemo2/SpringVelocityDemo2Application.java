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



        SpringApplication.run(SpringVelocityDemo2Application.class, args);
    }

}
