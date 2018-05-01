package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;

	public String getName() {
		System.out.println(getClass()+" getName() ");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+" setName() ");
		this.name = name;
	}

	public void addAccount(Account account, boolean vip) {
		System.out.println(getClass() + " DOING HIS WORK ");
	}
}
