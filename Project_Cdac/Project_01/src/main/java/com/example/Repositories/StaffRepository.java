package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Staff;
@Repository
public interface StaffRepository  extends JpaRepository<Staff,Integer>{

}
