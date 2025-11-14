package com.example.TurfServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.DTO.PaymentRequest;


@Service
public class PaymentClient {
	  private final RestTemplate restTemplate;
	    private final String paymentServiceUrl = "http://localhost:8082/payment/process";

	    public PaymentClient() {
	        this.restTemplate = new RestTemplate();
	    }

	    public void initiatePayment(PaymentRequest request) {
	        // fire and forget
	      
	            restTemplate.postForLocation(paymentServiceUrl, request);
	            System.out.println("✅ Payment initiation sent to Payment Service for Booking ID: " + request.getBookingId());
	    }
}
