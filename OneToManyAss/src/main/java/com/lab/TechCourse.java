//Kaushik Padwal
//Batch= ANP-2839

package com.lab;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TechCourse  
{
	
	
    public static void main( String[] args )
    {
         
    	Configuration cfg =  new Configuration().configure().addAnnotatedClass(Teacher.class);
     	Configuration cfg1=new Configuration().configure().addAnnotatedClass(Courses.class);
     	SessionFactory sf = cfg.buildSessionFactory(); // build Session factory
     	// session
     	Session ss = sf.openSession();
     	Transaction tx = ss.beginTransaction(); // transaction start

    	
    	//create Teacher
    	Teacher t = new Teacher();
    	t.setT_ID(1);
    	t.setName("Manali");
    	
    	//create Teacher
    	Teacher t1 = new Teacher();
    	t1.setT_ID(2);
    	t1.setName("Jagtap");
    	
    	// create course
    	Courses c = new Courses();
    	c.setC_Id(101);
    	c.setCourse_name("Java");
    	c.setTeacher(t);
    	
    	
    	// create course
    	Courses c1 = new Courses();
    	c1.setC_Id(102);
    	c1.setCourse_name("Python");
    	c1.setTeacher(t);
    	
    	// create  course
    	Courses c2 = new Courses();
    	c2.setC_Id(103);
    	c2.setCourse_name("Angular");
    	c2.setTeacher(t);
    	
    	// create course
    	Courses sc = new Courses();
    	sc.setC_Id(104);
    	sc.setCourse_name("Core Java");
    	sc.setTeacher(t1);
    	
    	// create course
    	Courses sc1 =new Courses();
    	sc1.setC_Id(105);
    	sc1.setCourse_name("C++");
    	sc1.setTeacher(t1);
    	
    	// course add in list
    	List<Courses>course=new ArrayList<Courses>();
    	// add course in list
    	course.add(c);
    	course.add(c1);
    	course.add(c2);
    	 // course add in list
    	List<Courses>course1=new ArrayList<Courses>();
    	course1.add(sc);
    	course1.add(sc1);
    	
    	
    	
		t.setCourse(course); 
		t1.setCourse(course1);
		
		//save
		ss.save(t);
		ss.save(t1);
		ss.save(c);
		ss.save(c1);
		ss.save(c2);
		ss.save(sc);
		ss.save(sc1);
		
		tx.commit();
	
    }
   
}
