package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.model.Employee;

@Controller
@RequestMapping("/createemployee")
public class EmployeeController {

	private List<Employee> employeeList;
	
	@PostConstruct
	public void loadData() {
		Employee e1 = new Employee("Ashok","Tudu","Ashok@gmail.com");
		Employee e2 = new Employee("Mukesh","Kumar","Mukesh@facebook.com");
		Employee e3 = new Employee("Vikash","Barnwal","Vikash@deoghar.com");
		
		employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
	}
	
	@GetMapping("/getall")
	public String getEmployeeList(Model theModel) {
		theModel.addAttribute("employees",employeeList);
		return "employeelist";
	}
	
}
