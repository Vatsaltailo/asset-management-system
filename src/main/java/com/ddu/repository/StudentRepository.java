package com.ddu.repository;


import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ddu.model.Student;

public interface StudentRepository extends CrudRepository<Student , Integer> {
	
	List<Student> findBysidAndPassword(String sid, String password);
	
	/*@Query("Select s1.password from student s1 where s=s1.sid")
	List<Student> findBysid();*/

}
