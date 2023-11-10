package com.practice.AspectOrientedProgramming.dao;

import com.practice.AspectOrientedProgramming.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{


    @Override
    public void addAccount() {
        System.out.println(getClass() + " Doing DB work By adding Account");
    }

    @Override
    public void call1() {
        System.out.println("Calling from the first method");
    }

    @Override
    public void call2() {
        System.out.println("Calling from the second method");
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("ch", "gold"));
        accounts.add(new Account("ch", "plat"));
        return  accounts;
    }
}
