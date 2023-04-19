package com.student.studentCRUD.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentCRUD.entiity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}
