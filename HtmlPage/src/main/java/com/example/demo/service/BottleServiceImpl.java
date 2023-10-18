package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bottle;
import com.example.demo.repository.BottleRepo;

@Service
public class BottleServiceImpl implements BottleService {

	@Autowired
	private BottleRepo bottleRepo;
	
	//get
	@Override
	public List<Bottle> get() {
		return this.bottleRepo.findAll();
	}
   
	
	//create
	@Override
	public void create(Bottle bottle) {
         this.bottleRepo.save(bottle);		
	}

	
	//create and get by id
	@Override
	public Bottle getById(long id) {
		Optional<Bottle> opt= bottleRepo.findById(id);
		Bottle bottle=null;
		if(opt.isPresent()) {
			bottle=opt.get();
		}else {
			throw new RuntimeException("Id is not present: "+id);
		}
		return bottle;
	}

	
	//delete by id
	@Override
	public void deleteById(long id) {
        this.bottleRepo.deleteById(id);		
	}

}
