package com.learning.demo.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/v1/student")  //localhost:portNo/swagger-ui.html 
public class StudentController {

	@Operation(tags = "Get Student API", description = "This API is to retrive a Student",
				responses = {
								@ApiResponse(responseCode = "200", description = "Success"),
								@ApiResponse(responseCode = "500", description = "Internal Server Error"),
								@ApiResponse(responseCode = "404", description = "Not Found !!")
						}
			)
	@GetMapping(value = "/getStudent")
	public String getStudent() {
		return "Student...";
	}
	
	@GetMapping(value = "/getAllStudent")
	public String getAllStudent() {
		return "Student All...";
	}
	
	@PostMapping(value = "/register")
	public String registerStudent() {
		return "Register Student...";
	}
	
	@Hidden //Now this URL or API will be hidden at the documentation side.
	@DeleteMapping(value = "/deleteStudent")
	public String deleteStudent() {
		return "Delete Student...";
	}
	
	@PutMapping(value = "/updateStudent")
	public String updateStudent() {
		return "Update Student...";
	}
	
}
