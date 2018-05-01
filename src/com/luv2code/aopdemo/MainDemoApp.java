package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
	
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);	
		Account theAccount= new Account();
		theAccountDAO.addAccount(theAccount, true);
		theAccountDAO.setName("fsdf");
		theAccountDAO.getName();
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);			
		theMembershipDAO.addAccount();
		theMembershipDAO.addSillyMember();
		
		context.close();
	
	}
}
