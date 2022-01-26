package com.sporty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sporty.entity.Purchase;
import com.sporty.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	public List<User> userList() {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String,Object>();
		List<User> result=jdbcTemplate.query("SELECT * FROM user", params,new ProductMapper());
		return result;
	}
	private static final class ProductMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			User user=new User(rs.getString("userId"),rs.getString("name"));
			System.out.println("userId="+rs.getString("userId"));
			return user;
		}
		
	}
	@Override
	public List<User> searchList(String name) {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String,Object>();
		List<User> result=jdbcTemplate.query("SELECT * FROM user where name='"+name+"'", params,new ProductMapper());
		return result;
	}
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		/*
		 * Map<String,Object> params=new HashMap<String,Object>(); User result=(User)
		 * jdbcTemplate.query("SELECT * FROM user where userId='"+userId+"'",new
		 * RowMapper() { public User mapRow(ResultSet rs,int rowNum) throws
		 * SQLException{ User user=new
		 * User(rs.getString("userId"),rs.getString("name")); return user; }
		 * 
		 * });
		 */
		
		Map<String,Object> params=new HashMap<String,Object>();
		List<User> result=jdbcTemplate.query("SELECT * FROM user where userId='"+userId+"'", params,new ProductMapper());
	User user=new User();
	user=result.get(0);
	System.out.println("user="+user.getName());
		return user;
	}
	
}
