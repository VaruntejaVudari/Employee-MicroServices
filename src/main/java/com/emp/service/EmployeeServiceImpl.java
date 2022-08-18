package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements iEmployeeService {

	List<Employee> list =  List.of(
			new Employee(3446L,"Hanvi","557687"),
			new Employee(3447L,"Ravi","554487"),
			new Employee(3448L,"shanvi","637687"),
			new Employee(3449L,"kavya","577687"),
			new Employee(3450L,"rakesh","337687")
			);
	
	@Override
	public Employee getEmployee(Long id) {
		
		return list.stream().filter(employee -> employee.getEid().equals(id)).findAny().orElse(null);
	}

}
