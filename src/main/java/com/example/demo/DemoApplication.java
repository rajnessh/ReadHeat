package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//VehicleIml iml=new VehicleIml();
		//iml.hoot();
		///iml.move();
	
		System.out.println("Hello world");
	}

	

}
