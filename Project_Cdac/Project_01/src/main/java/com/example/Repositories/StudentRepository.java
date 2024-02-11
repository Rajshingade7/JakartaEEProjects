package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Entities.Student;
@Repository//it is making repository,
@Transactional//Autocommit true karta hai kya
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}
