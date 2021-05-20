package com.example.saurav.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saurav.it.entity.Student;
import com.example.saurav.it.repository.StudentRepository;

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	public Student getByStudentId(int id) {
		return repository.findById(id).get();
	}

	public void saveorUpdate(Student student) {
		repository.save(student);
	}

	public void DeleteById(int id) {
		repository.deleteById(id);

	}

}
