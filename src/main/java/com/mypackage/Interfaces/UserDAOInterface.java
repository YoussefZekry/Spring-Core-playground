package com.mypackage.Interfaces;

import com.mypackage.Models.*;
public interface UserDAOInterface {
	
	public UserModel findUserByIdAndMob(int id,String mobile);
	public int count();
	public void update();
	public void delete();
}
