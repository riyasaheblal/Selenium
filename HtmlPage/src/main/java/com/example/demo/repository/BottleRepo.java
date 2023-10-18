package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bottle;

@Repository
public interface BottleRepo extends JpaRepository<Bottle, Long> {

}
