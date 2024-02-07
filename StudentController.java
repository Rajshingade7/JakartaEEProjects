package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.entities.Student;
import com.example.repositories.StudentRepository;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

//
//@RestController
//
//public class StudentController 
//{
////	@Autowired
////	StudentRepository srepository;
////	@GetMapping("new_student")
////	public String before()
////	{
////		return "Student";
////	}
////	@GetMapping("view_student")
////	public String getStudents(HttpServletRequest request)
////	{
////		List<Student> studentlist=srepository.findAll();
////		request.setAttribute("mylist", studentlist);
////		return "View";
////	}
////	@PostMapping("new_student")
////	public String afterSubmit(@RequestParam("name") String name,@RequestParam("age") int age)
////	{
////		Student s=new Student();
////		s.setName(name);
////		s.setAge(age);
////		srepository.save(s);
////		return "success";
////	}
//}
