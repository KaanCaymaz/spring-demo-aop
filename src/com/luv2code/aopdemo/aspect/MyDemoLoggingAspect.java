package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==> Executing @Before advice");
	}

//	@Before("forDaoPackage()")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n==> Executing @Before advice addAccount()");
//	}
	
	
//	@Before("execution( * com.luv2code.aopdemo.dao.*.*( ..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=========> Executing @Before advice on addAccount()");
//	}
	
//	@Before("execution( public void com.luv2code.aopdemo.dao.addAccount(*))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=========> Executing @Before advice on addAccount()");
//	}
	
//	@Before("execution( public void com.luv2code.aopdemo.dao.addAccount())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=========> Executing @Before advice on addAccount()");
//	}
}
