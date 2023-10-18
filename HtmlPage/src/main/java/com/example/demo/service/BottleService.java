package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Bottle;

public interface BottleService {
	
	//getAll
	List<Bottle> get();
	//create
	void create(Bottle bottle);
	//updateById
	Bottle getById(long id);
	//DeleteBYId
	void deleteById(long id);

}
