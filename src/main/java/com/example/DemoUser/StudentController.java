package com.example.DemoUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh", "Fadetory");

	}

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Tony", "Shark"));
		students.add(new Student("Huynh", "Ngoc Van"));
		return students;
	}

	// http:localhost:8080/student/minh/pham
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(lastName, firstName);
	}

	// http:localhost:8080/student/query?firstname=minh&lastname=hung
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
