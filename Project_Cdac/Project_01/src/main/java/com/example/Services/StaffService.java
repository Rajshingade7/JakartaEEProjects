package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Staff;
import com.example.Repositories.StaffRepository;


@Service
public class StaffService {
	@Autowired
	StaffRepository repo;

	public void addStaff(Staff p) {
		repo.save(p);
		
	}

	
	public List<Staff> getStaffs() {
		// TODO Auto-generated method stub
		return repo.findAll();
	
	}

	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public Optional<Staff> getStaff(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
