package com.practice.AspectOrientedProgramming.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
    @Before("execution( addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("Advice is calling before addAccount()");
    }
}
