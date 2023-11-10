package com.practice.AspectOrientedProgramming.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyAnalyticsAspect {
    @Before("execution(public void call1())")
    public void call1() {
        System.out.println("Hello from advice 1");
    }
}

