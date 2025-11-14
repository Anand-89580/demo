package com.example.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.TurfResponseDTO;
import com.example.Service.TurfService;
import com.example.entities.Turf;

@RestController
@RequestMapping("/turf")

public class TurfController {

	@Autowired
	private TurfService turfService;
	
	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to service";
	}
	
	
	
	@GetMapping("/getall")
	public ResponseEntity<List<TurfResponseDTO>> getall(){
		
		int limit=2;
		
		List<Turf> turfs=turfService.getRandomTurfs(limit);
		
		List<TurfResponseDTO> response=turfs.stream().map(TurfResponseDTO::fromEntity).collect(Collectors.toList());
		
		
		return ResponseEntity.ok(response);
		
	}
	
	
	@PostMapping("/addturf")
	public ResponseEntity<Turf> createTurf(@RequestBody Turf turf){
		
	Turf turf1 =turfService.createTurf(turf);
		
		
		return ResponseEntity.ok(turf1);
		
	}
	
	
	
	
	
	
	
	
	
	
}
