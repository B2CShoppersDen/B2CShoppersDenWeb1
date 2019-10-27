package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.model.ViewTransactionsModel;
import com.b2cshoppersden.utilities.ConnectionManager;



public class AdminDAO {

	@SuppressWarnings({ "static-access", "unused" })
	public boolean adminVerification(AdminLoginModel adminLoginModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		//String adminUserName1=null;
		//String password1=null;
		try 
		{
			//ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=ConnectionManager.openConnection1();
		
			String query="SELECT * FROM ShoppersDen.admin WHERE admin_username='"+adminLoginModel.getAdminUserName() +"' AND admin_password= '"+adminLoginModel.getPassword()+"'";
			
			//String query1="select  admin_username,admin_password from admin ";
			PreparedStatement statement1=connection.prepareStatement(query);
			ResultSet rs=statement1.executeQuery();
			
			while(rs.next())
			{
				String adminUserName=rs.getString("admin_username");
				String password=rs.getString("admin_password");
				//System.out.println(adminUserName+" "+password);
				return true;
			}
			rs.close();
			connection.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			System.out.println("Enter your id or password correct");
			}
		return false;
	}

	@SuppressWarnings("static-access")
	public boolean addProductVerification(AddProductModel addProductModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
	
		try 
		{
			ConnectionManager connectionManager=new ConnectionManager();
			Connection con=connectionManager.openConnection1();
		
			String querys = "INSERT INTO product VALUES(?,?,?,?,?,?)";
		// set all the preparedstatement parameters
		PreparedStatement statement= con.prepareStatement(querys);

		
		statement.setInt(1, addProductModel.getProductId());
		statement.setString(2, addProductModel.getProductName());
		statement.setString(3, addProductModel.getProductDescription());
		statement.setDouble(4, addProductModel.getProductPrice());
		statement.setString(5, addProductModel.getProductCategory());
		statement.setString(6, addProductModel.getProductImageUrl());
		
		
		

		// execute the preparedstatement insert
		statement.executeUpdate();

		// st.close();
		
		statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
	}
		
	@SuppressWarnings("static-access")
	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		
			try 
			{
				ConnectionManager connectionManager=new ConnectionManager();
				Connection connection=connectionManager.openConnection1();
			
				String querys = "DELETE FROM shoppersden.product WHERE product_id=?";
			// set all the preparedstatement parameters
		
				PreparedStatement statement = connection.prepareStatement(querys);

				statement.setInt(1, deleteProductModel.getProductId());
		
			// execute the preparedstatement insert
			statement.executeUpdate();

			// st.close();
			
			statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

					return true;
		}

	public boolean viewTransactionsVerification(ViewTransactionsModel viewTransactionsModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		
		try 
		{
			ConnectionManager connectionManager=new ConnectionManager();
			Connection connection=connectionManager.openConnection1();
		
			String querys = "select payment_id,payment_type,transaction_id from payment where payment_id=?";
		// set all the preparedstatement parameters
	
			PreparedStatement statement = connection.prepareStatement(querys);

		//statement.setInt(1, viewTransactionsModel.getTransactionId());
		statement.setInt(1, viewTransactionsModel.getPaymentId());
		//statement.setString(3, viewTransactionsModel.getPaymentType());

		// execute the preparedstatement insert
		ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
        	viewTransactionsModel.setPaymentId(resultSet.getInt("payment_id"));
        	viewTransactionsModel.setPaymentType(resultSet.getString("payment_type"));
        	viewTransactionsModel.setTransactionId(resultSet.getInt("transaction_id"));      	
        }
		// st.close();
		
		statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
	}

	}	

