package com.mypackage.Interfaces;

import java.util.List;
import java.util.Map;

import com.mypackage.Models.*;
public interface UserDAOInterface {
	
	// public UserModel findUserById(int id);
	// public List<Map<String,Object>> findAll();
	public Long count();
	public Person insert(Person person);
	// public void update(UserModel userModel);
	// public void delete(int userId);
}
