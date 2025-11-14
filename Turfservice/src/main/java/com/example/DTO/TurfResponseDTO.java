package com.example.DTO;

import com.example.entities.Turf;

public class TurfResponseDTO {
	
private Long id;
private String turfName;
private String turfLocation;
private byte[] turfImage;
private String address;
private double price_per_slot;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getPrice_per_slot() {
	return price_per_slot;
}
public void setPrice_per_slot(double price_per_slot) {
	this.price_per_slot = price_per_slot;
}

public static TurfResponseDTO fromEntity(Turf turf) {
	if(turf==null) return null;
	
	TurfResponseDTO dto=new TurfResponseDTO();
	
	dto.setId(turf.getTurfId());
	dto.setTurfName(turf.getTurfName());
	dto.setTurfLocation(turf.getTurfLocation());
	dto.setPrice_per_slot(turf.getPrice());
	dto.setTurfImage(turf.getTurfImage());
	dto.setAddress(turf.getAddress());
	
	return dto;

}









}
