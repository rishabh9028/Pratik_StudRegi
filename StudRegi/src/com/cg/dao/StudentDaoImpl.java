package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.model.StudentBean;

@Repository
public class StudentDaoImpl implements IStudentDao
{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void register(StudentBean bean)
	{
		entityManager.persist(bean);
	}

	@Override
	public List<StudentBean> getIds() 
	{
		String sql = "select bean from StudentBean bean";
		TypedQuery<StudentBean> query = entityManager.createQuery(sql,StudentBean.class);
		ArrayList<StudentBean> list = (ArrayList<StudentBean>) query.getResultList(); 
		return list;
	}

	@Override
	public StudentBean getById(int studentId ) 
	{		
		StudentBean bean =entityManager.find(StudentBean.class, studentId);
		return bean;
	}

	@Override
	public List<StudentBean> getall() 
	{
	Query query = (Query) entityManager.createNamedQuery("getall");
	@SuppressWarnings("unchecked")
	List<StudentBean> studlist = query.getResultList();
	return studlist;
	}

	@Override
	public List<StudentBean> getNames() 
	{
		Query query =(Query) entityManager.createNamedQuery("getname");
		@SuppressWarnings("unchecked")
		List<StudentBean> name = query.getResultList();
		return name;
	
	}

	@Override
	public StudentBean getByName(String studentName) 
	{
	Query query=(Query) entityManager.createNamedQuery("getNameDetails").setParameter("sName",studentName);
	@SuppressWarnings("unchecked")
	StudentBean bean = (StudentBean) query.getSingleResult();
	return bean;

	}

	@Override
	public List<StudentBean> deleteById()
	{
		Query query=(Query) entityManager.createNamedQuery("deleteId");
		@SuppressWarnings("unchecked")
		List<StudentBean> delete = query.getResultList();
        return delete;
    }

	@Override
	public void deleteDetails(StudentBean bean) 
	{
		entityManager.remove(bean);

	}

	@Override
	public List<StudentBean> updateById() {
		Query query=(Query) entityManager.createNamedQuery("deleteId");
		@SuppressWarnings("unchecked")
		List<StudentBean> update = query.getResultList();
        return update;
	}

	@Override
	public StudentBean updateStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		
		StudentBean student = entityManager.merge(bean);
		return student;
	}

	

	
	

	

}
