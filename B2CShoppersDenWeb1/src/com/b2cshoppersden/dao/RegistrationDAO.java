package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.b2cshoppersden.model.RegisterCustomerModel;
import com.b2cshoppersden.utilities.ConnectionManager;

public class RegistrationDAO {

	public static boolean customerStoreVerification(RegisterCustomerModel registerCustomerModel) {
		// TODO Auto-generated method stub
		int rows=0;
		int rows1=0;
		try 
		{
			ConnectionManager connectionUtility=new ConnectionManager();
			Connection con=connectionUtility.openConnection1();
		
			String querys = "INSERT INTO ShoppersDen.registration VALUES ("
			    + " ?, ?, ?, ?, ?)";
			String query1 = "insert into ShoppersDen.credentials values(?,?)";
		// set all the preparedStatement parameters
		PreparedStatement st = con.prepareStatement(querys);
		st.setString(1, registerCustomerModel.getUserName());		
		st.setString(2, registerCustomerModel.getPassword());
		st.setString(3, registerCustomerModel.getEmail());
		st.setInt(4, registerCustomerModel.getAge());
		st.setString(5, registerCustomerModel.getGender());
		PreparedStatement st1 = con.prepareStatement(query1);
		st1.setString(1, registerCustomerModel.getUserName());
		st1.setString(2, registerCustomerModel.getPassword());
		// execute the preparedStatement insert
		rows=st.executeUpdate();
		rows1=st1.executeUpdate();
   
		// st.close();
		
		st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rows>0 && rows1>0) {
				return true;
		}
	else {
		return false;

	}}
	}


