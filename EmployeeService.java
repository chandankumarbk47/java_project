package in.ac.jssate.employeemodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	//Retrieve All
	public List<Employee> listAll(){
		return repo.findAll();
		
	}
//RetrieveById
	public Employee get(Integer id) {
		return repo.findById(id).get();
	}
	//create
	public void save(Employee employee) {
		repo.save(employee);
	}
	//delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
