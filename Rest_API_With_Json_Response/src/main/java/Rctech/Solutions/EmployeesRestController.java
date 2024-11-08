package Rctech.Solutions;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesRestController {
	
	@DeleteMapping("/employee")
	public String deleteEmployee(@RequestParam ("id") String id) {
		return "Employee deleted";
	}
	
	@PutMapping("/employee")
	public String UpdateEmployee(@RequestBody Employess e) {
		System.out.println(e);
		return "Employee details updated";
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employess e) {
		
		System.out.println(e);
		return "Employee added";
		
	}
	
	@GetMapping("/employee")
	public Employess getEmployee() {
		Employess e =  new Employess("Ramcharan", "101", "tejaramcharan810@gmail.com", "java Developer", "java", "Bengulore");
		return e;
	}

	@GetMapping("/employess")
	public List<Employess> getEmployess() {
		Employess e =  new Employess("Ramcharan", "101", "tejaramcharan810@gmail.com", "java Developer", "java", "Bengulore");
		Employess e1 =  new Employess("Balaji", "102", "balaji@gmail.com", "finance Manager", "Accounts", "Bengulore");
		Employess e2 =  new Employess("Khasim", "103", "khasim0@gmail.com", "Devops", "java", "Bengulore");
		Employess e3 =  new Employess("Nandini Priya", "104", "priya@gmail.com", "HR", "HR", "Bengulore");
		Employess e4 =  new Employess("Harika", "105", "harika0@gmail.com", "test engineer", "java", "Bengulore");
		
		List<Employess> rc = Arrays.asList(e,e1,e2,e3,e4);
		return rc;
		
	}
}
