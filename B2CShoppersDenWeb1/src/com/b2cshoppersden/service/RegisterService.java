package com.b2cshoppersden.service;

import java.sql.SQLException;

import com.b2cshoppersden.model.RegisterCustomerModel;

public interface RegisterService {

	public boolean customerStoreVerification(RegisterCustomerModel registerCustomerModel)throws ClassNotFoundException,SQLException;
	
}
