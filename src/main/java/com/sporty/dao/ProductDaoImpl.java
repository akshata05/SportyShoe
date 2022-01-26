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
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Override
	public int ProductAdd(Product product) {
		// TODO Auto-generated method stub
		
	
		String sql = "insert into product(name,price,category) values(:name,:price,:category)";

		Map<String, Object> paramMap = new HashMap<String, Object>();
	    paramMap.put("name", product.getName());
	    paramMap.put("price", product.getPrice());
	    paramMap.put("category", product.getCategory());
		int success=jdbcTemplate.update(sql,paramMap);

		
		return success;
	}
	@Override
	public Product getProduct(String productId) {
		// TODO Auto-generated method stub
		/*
		 * Map<String,Object> params=new HashMap<String,Object>(); Product
		 * result=(Product)
		 * jdbcTemplate.query("SELECT * FROM product where id='"+productId+"'",new
		 * RowMapper() { public Product mapRow(ResultSet rs,int rowNum) throws
		 * SQLException{ Product product=new
		 * Product(rs.getString("name"),rs.getDouble("price"),rs.getString("category"));
		 * return product; }
		 * 
		 * }); return result;
		 */
		Map<String,Object> params=new HashMap<String,Object>();
		List<Product> result=jdbcTemplate.query("SELECT * FROM product where id="+productId, params,new ProductMapper());
	Product product=new Product();
	product=result.get(0);
		return product;
	}

	private static final class ProductMapper implements RowMapper<Product>
	{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Product product=new Product(rs.getString("name"),rs.getDouble("price"),rs.getString("category"));
	;
			return product;
		}
		
	}
		
	}

