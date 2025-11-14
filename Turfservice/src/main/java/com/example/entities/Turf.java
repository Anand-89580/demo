package com.example.entities;
import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "turfs")

public class Turf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turfId;

    @Column(name = "turf_name", nullable = false)
    private String turfName;

    @Column(name = "turf_location", nullable = false)
    private String turfLocation;

    @Lob
    @Column(name = "turf_image", columnDefinition = "LONGBLOB")
    private byte[] turfImage;

    @Column(name = "price_per_slot", nullable = false)
    private double price;

    @Column(nullable = false)
    private String address;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(columnDefinition = "TEXT")
    private String description;

    @CreationTimestamp
    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOn;

    @UpdateTimestamp
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "user_id", nullable = false)
    private Long userId;
    
    
    public Turf() {
    	
    }
    
    
    

    // Custom constructor (optional for easy creation)
    public Turf(String turfName, String turfLocation, byte[] turfImage,
                String address, String description, double price) {
        this.turfName = turfName;
        this.turfLocation = turfLocation;
        this.turfImage = turfImage;
        this.address = address;
        this.description = description;
        this.price = price;
    }

	public Long getTurfId() {
		return turfId;
	}

	public void setTurfId(Long turfId) {
		this.turfId = turfId;
	}

	public String getTurfName() {
		return turfName;
	}

	public void setTurfName(String turfName) {
		this.turfName = turfName;
	}

	public String getTurfLocation() {
		return turfLocation;
	}

	public void setTurfLocation(String turfLocation) {
		this.turfLocation = turfLocation;
	}

	public byte[] getTurfImage() {
		return turfImage;
	}

	public void setTurfImage(byte[] turfImage) {
		this.turfImage = turfImage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
    
  
    
}
