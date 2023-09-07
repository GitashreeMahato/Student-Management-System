	package jspstudent.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jspstudent.dto.Student;

public class StudentDao {
	public EntityManager getmanager() {
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
	}

	
	public Student signUpStudent(Student student) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		
		return student;
		
		
	}
	
	

	public List<Student> getAllStudent(){
		EntityManager em=getmanager();
		Query query=em.createQuery("select a from Student a");
		List<Student> list=query.getResultList();
		
		return list;
		
	}


	public Student getStudentByEmail(String email) {
		
		EntityManager em=getmanager();
		Query query=em.createQuery("select a from Student a where a.stuemail=?1");
		query.setParameter(1, email);
		Student student=(Student) query.getSingleResult();
		return student;
		
	}
	
	public void deleteStudent(int id) {
		EntityManager em=getmanager();
		Student stu=em.find(Student.class, id);
		if(stu!=null) {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(stu);
			et.commit();
		
		
	}
		
	}
	
	public void updateStudent(int id, Student student) {
		EntityManager em=getmanager();
		Student stu=em.find(Student.class, id);
		if(stu!=null) {
			stu.setSid(id);
			
			EntityTransaction et= em.getTransaction();
			et.begin();
			
			
			em.persist(stu);
			et.commit();
			
		}
		
		
	}


	public Student getStudentById(int id) {
		EntityManager em=getmanager();
		Student stu=em.find(Student.class, id);
		
		return stu;
		
		
	}
	
}

