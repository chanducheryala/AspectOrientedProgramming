package com.practice.AspectOrientedProgramming.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + " Doing DB work By adding Account");
    }
}
