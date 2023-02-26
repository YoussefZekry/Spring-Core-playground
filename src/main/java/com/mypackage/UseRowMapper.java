package com.mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mypackage.Models.User;

// public class UseRowMapper implements RowMapper{

// 	@Override
// 	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
// 		UserModel userModel = new UserModel();
// 		userModel.setUser_name(rs.getString("user_name"));
// 		userModel.setFull_name(rs.getString("full_name"));
// 		userModel.setAddress(rs.getString("address"));
// 		userModel.setMobile(rs.getString("mobile"));
// 		return userModel;
// 	}
	
// }