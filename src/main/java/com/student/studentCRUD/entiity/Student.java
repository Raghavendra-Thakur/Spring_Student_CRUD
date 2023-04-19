package com.student.studentCRUD.entiity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "Enter Name")
	@Size(min = 4 , message = "Name should be minimum of 4 Charechters")
	private String name;
	@NotBlank(message = "Enter Phone Number")
	@Pattern(regexp="(^$|[0-9]{10})" , message = "Phone Number Should Have 10 Digits")
	private String phoneno;
	private String division;

	public Student() {

	}

	public Student(int id, String name, String phoneno, String division) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.division = division;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	

}
