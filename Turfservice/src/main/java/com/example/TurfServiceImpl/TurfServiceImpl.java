package com.example.TurfServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Service.TurfService;
import com.example.Turfrepository.TurfRepository;
import com.example.entities.Turf;

@Service
public class TurfServiceImpl implements TurfService {

	@Autowired
	private TurfRepository turfDao;

	@Override
	public Turf saveUser(Turf user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Turf getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turf> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Turf> getRandomTurfs(int limit) {
	    List<Turf> allTurfs = turfDao.findAll();
	    if (allTurfs.isEmpty()) return new ArrayList<>();
	    
	    Collections.shuffle(allTurfs);
	    return allTurfs.stream().limit(limit).collect(Collectors.toList());
	}



	@Override
	public Turf createTurf(Turf turf) {
		// TODO Auto-generated method stub
		return turfDao.save(turf);
	}
	



	
	
	
	
	
}
