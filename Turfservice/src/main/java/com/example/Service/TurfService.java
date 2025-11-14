package com.example.Service;

import java.util.List;

import com.example.entities.Turf;

public interface TurfService {

	Turf saveUser(Turf user);
	Turf getUserById(Long id);
	List<Turf> getAllUsers();
	List<Turf>getRandomTurfs(int limit);
	Turf createTurf(Turf turf);

	
}
