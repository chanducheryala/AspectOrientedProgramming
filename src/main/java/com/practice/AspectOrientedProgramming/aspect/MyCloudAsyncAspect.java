package com.practice.AspectOrientedProgramming.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudAsyncAspect {
    @Before("execution(public void call1())")
    public void call2() {
        System.out.println("Hello from advice 2");
    }
}
