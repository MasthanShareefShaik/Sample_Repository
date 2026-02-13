package com.example.sts_check.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
public boolean pipline_check_method() {
	System.out.println("third pipe line check");
	return true;
}
public String pipline_check_() {
	System.out.println("fourth pipe line check");
	return "masthan shareef";
}
}
