package com.training.assign1b;

import java.util.Arrays;
import java.util.List;

public class EmpStreamMap {

	public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(101, "abcd"), new Employee(102, "efgh"), new Employee(103, "ijkl"),
                new Employee(104, "mnop"), new Employee(105, "qrst"));
        
        emp.stream().map(Employee::getEmpid)
        .forEach((id -> 
        {
            System.out.println("id :"+id);
        }));

 

    }
	
}
