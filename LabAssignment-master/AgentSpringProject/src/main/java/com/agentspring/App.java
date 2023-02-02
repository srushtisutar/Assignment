//Assignment : Spring FrameWork
// Name: Kaushik Padwal
//Tbale name: Agent_Details
package com.agentspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App // create class
{
 public static void main( String[] args )


{
	  ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
      AgentDao Dao=(AgentDao)ap.getBean("e");
      
      // Insert
      //1st Entry
     // System.out.println(Dao.saveAgent(new Agent(1,"Ajay",54000))); //save method call
      //2nd Entry
     // System.out.println(Dao.saveAgent(new Agent(2,"Kaushik",74000))); //save method call
      //3rd Entry
     //System.out.println(Dao.saveAgent(new Agent(3,"Monika",84000))); //save method call
      
      // update
      //System.out.println(Dao.updateAgent(new Agent(1,"Ajay",65000)));// update method call
      
      //Delete
      System.out.println(Dao.deleteAgent(new Agent(3)));// delete method call
      
      
     

         
       
    }
}

