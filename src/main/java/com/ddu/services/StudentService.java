package com.ddu.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


import com.ddu.model.Student;
import com.ddu.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}

	public void save(Student student)
	{
		studentRepository.save(student);
	}
	
	public int validate(Student student)
	{
		StringBuffer retBuf = new StringBuffer();
		int i=100;

		List<Student> studentList = (List<Student>) studentRepository
	           .findBysidAndPassword(student.getsid(), student.getPassword());
	
	    if (studentList != null) 
	    {
	        for (Student student1 : studentList) 
	        {
	            retBuf.append("user name = ");
	            retBuf.append(student1.getsid());
	            retBuf.append(", password = ");
	            retBuf.append(student1.getPassword());
	            retBuf.append("<br/>");
	            i=0;
	        }
	    }
	    else
	    {
	        retBuf.append("invalid");
	        i=1;
	    }
	
	    if (retBuf.length() == 0) {
	        retBuf.append("invalid");
	        i=1;
	    }
	    return  i;
	    //System.out.println(retBuf);
	}
	
	
	/*public String getpassword(String student)
	{
		List<Student> studentList = (List<Student>) studentRepository
		           .findBysid();
		String password="";
		if (studentList != null) 
	    {
	        for (Student student1 : studentList) 
	        {
	        	password=student1.getPassword();
	        }
	    }
		return password;
	}*/
}
