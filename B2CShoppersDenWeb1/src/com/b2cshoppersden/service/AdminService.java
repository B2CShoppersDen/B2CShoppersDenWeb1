package com.b2cshoppersden.service;

import java.sql.SQLException;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.model.ViewTransactionsModel;

public interface AdminService {

	public boolean Verification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException;
	public boolean addProductVerification(AddProductModel addProductModel) throws ClassNotFoundException,SQLException;
	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) throws ClassNotFoundException, SQLException;
	public boolean viewTransactionsVerification(ViewTransactionsModel viewTransactionsModel)throws ClassNotFoundException,SQLException;
}
