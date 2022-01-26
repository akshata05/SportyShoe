package com.sporty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sporty.entity.Product;
import com.sporty.entity.Purchase;
import com.sporty.entity.User;
@Repository
public class PurchaseDaoImpl implements PurchaseDao{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public List<Purchase> purchaseList() {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String,Object>();
		List<Purchase> result=jdbcTemplate.query("SELECT * FROM purchase", params,new ProductMapper());
		return result;
	}

	private static final class ProductMapper implements RowMapper<Purchase>
	{

		@Override
		public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Purchase purchase=new Purchase(rs.getString("userId"),rs.getString("productId"),rs.getDate("Date"));
			System.out.println("userId="+rs.getString("userId"));
			return purchase;
		}
		
	}
}
