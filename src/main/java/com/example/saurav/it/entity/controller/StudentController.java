package com.example.saurav.it.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saurav.it.entity.Student;
import com.example.saurav.it.service.StudentServiceImpl;

@RestController
@RequestMapping("/curd")
public class StudentController {
	@Autowired
	StudentServiceImpl service;

	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return service.getAllStudent();

	}

	@GetMapping("/student/{studentid}")
	public Student getStudent(@PathVariable("studentid") int id) {
		return service.getByStudentId(id);
	}

	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student) {
		service.saveorUpdate(student);
		return student.getSno();

	}

	@DeleteMapping("/student/{studentid}")
	public void DeleteById(@PathVariable("studentid") int id) {
		service.DeleteById(id);

	}

}
