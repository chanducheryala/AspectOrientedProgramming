package com.practice.AspectOrientedProgramming.aspect;

import com.practice.AspectOrientedProgramming.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class MyLoggingAspect {
    @Pointcut("execution(* addAccount())")
    private void forDAOPackage() {
    }

    ;

    @Before("forDAOPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("Advice is calling before addAccount()");
    }


    @AfterReturning(pointcut = "execution(* com.practice.AspectOrientedProgramming.dao.AccountDAO.findAll(..))", returning = "result")
    public void getAllAccounts(JoinPoint joinPoint, List<Account> result) {

        for (Account account : result) {
            account.setName(account.getLevel().toUpperCase());
        }
        System.out.println("The Result for AfterReturning : " + result);
    }

    @Around("execution(* com.practice.AspectOrientedProgramming.service.TrafficFortuneService.getFortune(..))")
    public Object aroundFortune(
            ProceedingJoinPoint proceedingJoinPoint
    ) throws Throwable {
        String method = proceedingJoinPoint.getSignature().toShortString();
        System.out.println("The method : " + method);
        long begin = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        long duration = end - begin;
        System.out.println("\n ===> The duration : " + duration / 1000.0 + "seconds");
        return result;
    }
}
