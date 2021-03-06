package com.cg.service;

import java.util.List;

import com.cg.model.StudentBean;

public interface IStudentService
{

	void register(StudentBean bean);

	List<StudentBean> getIds();

	StudentBean getById(int studentId);

	List<StudentBean> getall();

	List<StudentBean> getNames();

	StudentBean getByName(String studentName);

	List<StudentBean> deleteById();

	void deleteDetails(StudentBean bean);


	StudentBean updateStudent(StudentBean bean);

	

	

}
