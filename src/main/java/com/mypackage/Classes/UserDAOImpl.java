package com.mypackage.Classes;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mypackage.UseRowMapper;
import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.UserModel;

public class UserDAOImpl implements UserDAOInterface,RowMapper{
	
	private JdbcTemplate jdbcTemplate;

	// public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public UserModel findUserByIdAndMob(int id) {
        String sql="select * from user where id = ?";
        Object[] args= new Object[] {id};
        UserModel user=(UserModel)jdbcTemplate.queryForObject(sql, args, new UseRowMapper());		
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

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
