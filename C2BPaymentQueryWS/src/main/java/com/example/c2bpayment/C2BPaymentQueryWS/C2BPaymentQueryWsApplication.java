package com.example.c2bpayment.C2BPaymentQueryWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration;

@SpringBootApplication(exclude = WebServicesAutoConfiguration.class)
public class C2BPaymentQueryWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(C2BPaymentQueryWsApplication.class, args);
	}

}
