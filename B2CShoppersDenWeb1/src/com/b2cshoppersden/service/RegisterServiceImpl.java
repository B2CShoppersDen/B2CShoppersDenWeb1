package com.b2cshoppersden.service;

import java.sql.SQLException;

import com.b2cshoppersden.dao.RegistrationDAO;
import com.b2cshoppersden.model.RegisterCustomerModel;

public class RegisterServiceImpl implements RegisterService{

	public boolean customerStoreVerification(RegisterCustomerModel registerCustomerModel) throws ClassNotFoundException,SQLException {
		RegistrationDAO dao=new RegistrationDAO();
		// TODO Auto-generated method stub
		boolean result=dao.customerStoreVerification(registerCustomerModel);
		return result;
	}	
}
