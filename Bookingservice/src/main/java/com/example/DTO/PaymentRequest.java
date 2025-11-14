package com.example.DTO;

import java.math.BigDecimal;

public class PaymentRequest {
    private Long bookingId;
    private BigDecimal amount;
    
    public PaymentRequest() {
    	
    }

	public PaymentRequest(Long bookingId, BigDecimal amount) {
		super();
		this.bookingId = bookingId;
		this.amount = amount;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
    
    
    
    
    
}
