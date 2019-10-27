package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.DataModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewCartProductsModel;
import com.b2cshoppersden.model.ViewProductsModel;
import com.b2cshoppersden.service.AdminServiceImpl;
import com.b2cshoppersden.utilities.ConnectionManager;


public class CustomerDAO {
	Logger logger=Logger.getLogger(CustomerDAO.class.getName());
	//@SuppressWarnings({ "static-access", "unused" })
	//public modelClassName customerVerification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
	public boolean customerVerification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		logger.info("customer dao called");
		try 
		{
			String username;
			String password;
			//ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=ConnectionManager.openConnection1();
		
			String query="SELECT * FROM ShoppersDen.credentials WHERE user_name='"+customerLoginModel.getUserName() +"' AND user_password= '"+customerLoginModel.getPassword()+"'";
			PreparedStatement statement=connection.prepareStatement(query);
		
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				username=rs.getString("user_name");
				password=rs.getString("user_password");
				System.out.println(username+""+password);
				return true;
				// validation logic
				
				//DataModel dm=new DataModel(true,username);
				//return dm;
			}
			
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("UserName or password is Incorrect");
			e.printStackTrace();
			}
		logger.info("customer dao completed");
		return false; //return model
}
	


//	@SuppressWarnings("static-access")	
	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="select * from product where product_name=?";
			PreparedStatement statement = connection.prepareStatement(query);
			//statement.setString(1,viewProductsModel.getProductName());
			statement.setInt(1,viewProductsModel.getProductId());
			//statement.setString(2,viewProductsModel.getProductImageUrl());
			//statement.setString(3,viewProductsModel.getProductDescription());
			//statement.setDouble(4,viewProductsModel.getProductPrice());		
			//statement.setString(5,viewProductsModel.getProductCategory());
		
			ResultSet resultSet = statement.executeQuery();
	        while(resultSet.next()) {
	        	viewProductsModel.setProductId(resultSet.getInt("product_id"));
	        //viewProductsModel.setProductName(resultSet.getString("product_name"));
	        	//viewProductsModel.setProductCategory(resultSet.getString("product_category"));
	       // 	viewProductsModel.setProductImageUrl(resultSet.getString("product_imageurl"));
	        //	viewProductsModel.setProductPrice(resultSet.getDouble("product_price"));
	        //	viewProductsModel.setProductDescription(resultSet.getString("product_description"));
	        }
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}


	

	public boolean addtoCartVerification(AddToCartModel addToCartModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="insert into shoppingcart where product_name=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1,addToCartModel.getProductName());
			//statement.setInt(2,addToCartModel.getProductId());
			//statement.setString(3,addToCartModel.getProductImageUrl());
			//statement.setString(4,addToCartModel.getProductDescription());
			//statement.setDouble(5,addToCartModel.getProductPrice());		
			//statement.setString(6,addToCartModel.getProductCategory());
		          
			statement.executeUpdate();
	
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}


	public boolean viewCartProductsVerification(ViewCartProductsModel viewCartProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="select * from  product where product_name=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1,viewCartProductsModel.getProductName());
			/*statement.setInt(2,viewCartProductsModel.getProductId());
			statement.setString(3,viewCartProductsModel.getProductImageUrl());
			statement.setString(4,viewCartProductsModel.getProductDescription());
			statement.setDouble(5,viewCartProductsModel.getProductPrice());		
			statement.setString(6,viewCartProductsModel.getProductCategory());
			*/
			statement.executeUpdate();
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}

		

	}
		
		
		
		
		

