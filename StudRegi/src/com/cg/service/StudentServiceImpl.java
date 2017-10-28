package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IStudentDao;
import com.cg.model.StudentBean;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService
{
	@Autowired
     private IStudentDao dao;
     
	@Override
	public void register(StudentBean bean) {
		 dao.register(bean);
		
	}

	@Override
	public List<StudentBean> getIds() 
	{
		
		return dao.getIds();
	}

	@Override
	public StudentBean getById(int studentId) {
	return dao.getById( studentId);
	}

	@Override
	public List<StudentBean> getall() {
		
		return dao.getall();
	}

	@Override
	public List<StudentBean> getNames() {
		
		return  dao.getNames();
	}

	@Override
	public StudentBean getByName(String studentName) {
		return dao.getByName(studentName);
	}

	@Override
	public List<StudentBean> deleteById() {
		return dao.deleteById();
	}

	@Override
	public void deleteDetails(StudentBean bean) {
        dao.deleteDetails(bean)	;
	}

	@Override
	public StudentBean updateStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		return dao.updateStudent(bean);
	}

	

	

	

}
