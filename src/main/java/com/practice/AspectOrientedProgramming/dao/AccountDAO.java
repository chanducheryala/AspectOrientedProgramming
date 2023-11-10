package com.practice.AspectOrientedProgramming.dao;

import com.practice.AspectOrientedProgramming.Account;

import java.util.List;

public interface AccountDAO {
    void addAccount();

    void call1();

    void call2();

    List<Account> findAll();
}
