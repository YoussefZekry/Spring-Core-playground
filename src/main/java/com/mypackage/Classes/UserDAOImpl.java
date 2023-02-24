package com.mypackage.Classes;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.UserModel;

public class UserDAOImpl implements UserDAOInterface{
	
	private JdbcTemplate jdbcTemplate;

	// public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public UserModel findUserByIdAndMob(int id,String mobile) {
        String sql="select * from user where id = ? and mobile = ?";
        Object[] args= new Object[] {id,mobile};
        UserModel user=jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper<>(UserModel.class));		
        return user;
    }
	
	@Override
	public int count() {
		String SQL = "select count(*) from user";
		int rowCount = jdbcTemplate.queryForObject(SQL, Integer.class);
		return rowCount;
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}
