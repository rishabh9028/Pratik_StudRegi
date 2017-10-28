package com.cg.dao;

import java.util.List;

import com.cg.model.StudentBean;

public interface IStudentDao 
{

	void register(StudentBean bean);

	List<StudentBean> getIds();

	StudentBean getById(int studentId);

	List<StudentBean> getall();

	List<StudentBean> getNames();

	StudentBean getByName(String studentName);

	List<StudentBean> deleteById();

	void deleteDetails(StudentBean bean);

	List<StudentBean> updateById();

	

	StudentBean updateStudent(StudentBean bean);

	//void updateDetails(StudentBean bean);


}
