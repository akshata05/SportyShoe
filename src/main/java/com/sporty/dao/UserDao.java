package com.sporty.dao;

import java.util.List;

import com.sporty.entity.Purchase;
import com.sporty.entity.User;

public interface UserDao {
public List<User> userList();
public User getUser(String userId);
public List<User> searchList(String name);
}
