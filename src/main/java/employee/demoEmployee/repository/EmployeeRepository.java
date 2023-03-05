package employee.demoEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.demoEmployee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	

}
