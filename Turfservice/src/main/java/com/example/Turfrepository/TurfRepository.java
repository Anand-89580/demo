package com.example.Turfrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Turf;

@Repository
public interface TurfRepository extends JpaRepository<Turf,Long> {

}
