package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass()+" DOING HIS WORK");
	}

	public void addSillyMember() {
		System.out.println(getClass()+" DOING HIS WORK");
	}
	

}
