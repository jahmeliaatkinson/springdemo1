package com.tcs.springbootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tcs.springbootdemo.model.Employee;

import com.tcs.springbootdemo.service.EmployeeServices;

@SpringBootApplication
// 1. @SpringBootConfiguration ====@Configuration

//2. @EnableAutoConfiguration
//here it enables spring boot to auto-configure the application context.
// it automaticaly creates and register beans based on both the included jar files in the classpath & beans defined by us.
// Spring MVC ===> spring web jar and tomcat server plugin.
// wehn spring web starter=== > it will include the tomcat server mvc based conf.g
// exculde names autoconfig we want to skipp specify that list to @enableautoconfiguration

//3. @ComponentScan




public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		
//		String [] beanNames= applicationContext.getBeanDefinitionNames();
//		
//		Arrays.sort(beanNames);
//		
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
		
		
		EmployeeServices employeeServices = context.getBean(EmployeeServices.class);
		EmployeeServices employeeServices2 = context.getBean(EmployeeServices.class);
		Employee employee = new Employee(3, 3, 3, "Mary Blue", 22, "Associate", null);
		String result = employeeServices.addEmployee(employee);
		System.out.println(result);
		System.out.println(employeeServices.equals(employeeServices2));
		System.out.println(employeeServices == employeeServices2);
		
		
		
		/**
		Optional<List<Product>> optional = productService.getProductsByCategory("mac laptop");
		
		if(optional.isPresent()) {
			List<Product> products = optional.get();
			products.forEach(p->{
				System.out.println(p);
			});
		}
		else {
			System.out.println("problem");
		} */
//		
//		if(productService.getProductById(5).isPresent()) {
//			System.out.println("product exists ");
//		}
//		else {
//			System.out.println("not available");
//		}
		//context.close();
	}

}
