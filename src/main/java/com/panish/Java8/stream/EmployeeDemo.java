package com.panish.Java8.stream;

import com.panish.Java8.stream.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeeDemo {
	public static void main(String[] args) {
		List<Employee> list = prepareData();
		list.stream()
		.filter(e->e.getAge() > 20)
		.forEach(e-> System.out.println(e.getName()));
		
		long count = list.stream().filter(e -> e.getAge() == 25).count();
		System.out.println(count);
		
		Optional<Employee> e1 = list.stream()
		.filter(e -> e.getName().equals("emp1"))
		.findAny();
		if(e1.isPresent())
			System.out.println(e1.get());
		
		OptionalInt maxAge = list.stream()
				.mapToInt(Employee::getAge).max();
		
		if(maxAge.isPresent())
			System.out.println(maxAge.getAsInt());
		
		list.sort((e4,e5) -> e4.getAge() - e5.getAge());
		list.forEach(System.out::println);
		
		List<String> empNames = list.stream().map(Employee::getName).collect(Collectors.toList());
		String empNamesStr = String.join(",", empNames);
		System.out.println(empNamesStr);
		
	}
	
	public static List<Employee> prepareData() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("emp1",18));
		list.add(new Employee("emp2",19));
		list.add(new Employee("emp3",20));
		list.add(new Employee("emp4",21));
		list.add(new Employee("emp5",22));
		list.add(new Employee("emp6",23));
		list.add(new Employee("emp7",24));
		list.add(new Employee("emp8",25));
		list.add(new Employee("emp9",26));
		list.add(new Employee("emp10",27));
		return list;
	}
}
