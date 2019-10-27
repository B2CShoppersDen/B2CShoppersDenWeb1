package com.b2cshoppersden.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.b2cshoppersden.dao.AdminDAO;
import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.model.ViewTransactionsModel;


public class AdminServiceImpl implements AdminService {

	AdminDAO adminDAO=new AdminDAO();
	Logger logger=Logger.getLogger(AdminServiceImpl.class.getName());
	public boolean Verification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		logger.info("Verification called");
		return adminDAO.adminVerification(adminLoginModel);
		
	}

	public boolean addProductVerification(AddProductModel addProductModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return adminDAO.addProductVerification(addProductModel);
	}

	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return adminDAO.deleteProductVerification(deleteProductModel);
	
	}

	
	public boolean viewTransactionsVerification(ViewTransactionsModel viewTransactionsModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return adminDAO.viewTransactionsVerification(viewTransactionsModel);
	
	}

	
	

}
