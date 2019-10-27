package com.b2cshoppersden.service;

import java.sql.SQLException;

import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewProductsModel;

public interface CustomerService {
	
	
	public boolean Verification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException;

	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) throws ClassNotFoundException,SQLException;
	public boolean addToCartVerification(AddToCartModel addToCartModel) throws ClassNotFoundException,SQLException;
	public boolean paymentVerification(PaymentModel paymentModel) throws ClassNotFoundException,SQLException;

}
