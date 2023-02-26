package com.mypackage.Classes;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.support.TransactionTemplate;

import com.mypackage.Interfaces.UserDAOInterface;

public class UserDAOImpl implements UserDAOInterface{
	
	// private JdbcTemplate jdbcTemplate;
	private HibernateTemplate hibernateTemplate;
	private TransactionTemplate transactionTemplate;
		// public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

	// @Autowired
	// public void setDataSource(DataSource dataSource) {
	// 	jdbcTemplate = new JdbcTemplate(dataSource);
	// }

	// @Override
	// public void insert(UserModel userModel) {
	// 	String sql = "INSERT INTO `biddingschema`.`user` (`email`, `address`,`phone`, `mobile`, `date_of_birth`, `registration_date`, `user_name`, `password`, `full_name`) VALUES (?,?,?,?,?,?,?,?,?)";
	// 	Object[] args = new Object[]{
	// 		// userModel.getId(),
	// 		userModel.getEmail(),
	// 		userModel.getAddress(),
	// 		userModel.getPhone(),
	// 		userModel.getMobile(),
	// 		userModel.getDate_of_birth(),
	// 		userModel.getRegistration_date(),
	// 		userModel.getUser_name(),
	// 		userModel.getPassword(),
	// 		userModel.getFull_name()
	// 		};
	// 	int x = jdbcTemplate.update(sql, args);
	// 	System.out.println(x);
	// }

	// @Override
	// public UserModel findUserById(int id) {
    //     String sql="select * from user where id = ?";
    //     Object[] args= new Object[] {id};
    //     UserModel user=(UserModel)jdbcTemplate.queryForObject(sql, args, new UseRowMapper());		
    //     return user;
    // }
	
	// @Override
	// public List<Map<String,Object>> findAll() {
	// 	String sql = "SELECT * FROM user";
	// 	List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
	// 	for(Map row : rows){
	// 		UserModel userModel = new UserModel();
	// 		userModel.setFull_name((String)row.get("full_name"));
	// 		userModel.setAddress((String)row.get("address"));
	// 		userModel.setMobile((String)row.get("mobile"));
	// 		System.out.println("*********inside findAll**********");
	// 	}
	// 	// System.out.println(rows);	
	// 	return rows;
	// }

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Long count() {
		String SQL = "select count(*) from Person";
		List rowCount = getHibernateTemplate().find(SQL);
		System.out.println("*********************************************"+rowCount+"*********************************************************");
		return (Long)rowCount.get(0);
		
	}



	// @Override
	// public void update(UserModel userModel) {
	// 	String sql = "UPDATE user set email = ?, address = ?, phone = ? where id = ?";
	// 	Object[] args = new Object[]{
	// 		userModel.getEmail(),
	// 		userModel.getAddress(),
	// 		userModel.getPhone(),
	// 		userModel.getId()};
	// 	jdbcTemplate.update(sql,args);		
	// }

	// @Override
	// public void delete(int userId) {
	// String sql = "delete from user where id = ?";
	// Object[] args = new Object[]{userId};
	// jdbcTemplate.update(sql,args);		
	// }

	// @Override
	// public int[] getRowsForPaths(TreePath[] arg0) {
	// 	// TODO Auto-generated method stub
	// 	return null;
	// }




	
}
