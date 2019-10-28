package ee.praktika.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ee.praktika.springboot.cruddemo.entity.Employee;

@RepositoryRestResource( path = "basketball-players" )
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //no need to write any code, CRUD methods will be received for free.
}
