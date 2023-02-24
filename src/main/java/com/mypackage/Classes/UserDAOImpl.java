package com.mypackage.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	public UserModel findUserById(int id) {
        String sql="select * from user where id = ?";
        Object[] args= new Object[] {id};
        UserModel user=(UserModel)jdbcTemplate.queryForObject(sql, args, new UseRowMapper());		
        return user;
    }
	
	@Override
	public List<Map<String,Object>> findAll() {
		String sql = "SELECT * FROM user";
		List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
		for(Map row : rows){
			UserModel userModel = new UserModel();
			userModel.setFull_name((String)row.get("full_name"));
			userModel.setAddress((String)row.get("address"));
			userModel.setMobile((String)row.get("mobile"));
			System.out.println("*********inside findAll**********");
		}
		// System.out.println(rows);	
		return rows;
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
