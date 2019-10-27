package com.b2cshoppersden.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.service.AdminService;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AdminService adminService; 

    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		
		String productName=request.getParameter("productName");
		String productDescription=request.getParameter("productDesc");
		String productCategory=request.getParameter("product_category");
		String productImageUrl=request.getParameter("productDesc");
		int productId=Integer.parseInt(request.getParameter("productId"));
		double productPrice=Double.parseDouble(request.getParameter("productPrice"));
		
		AddProductModel addProductModel=new AddProductModel();
		addProductModel.setProductId(productId);
		addProductModel.setProductName(productName);
		addProductModel.setProductDescription(productDescription);
		addProductModel.setProductPrice(productPrice);
		addProductModel.setProductCategory(productCategory);
		addProductModel.setProductImageUrl(productImageUrl);
		System.out.println("outcome");
	
		
		try {
			boolean outcome=adminService.addProductVerification(addProductModel);
			System.out.println(outcome);
			     if(outcome=true) {
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("success.jsp");
				dispatcher.forward(request,response);
			}
			     else
			     {
			    	 RequestDispatcher dispatcher=
								request.getRequestDispatcher("fail.jsp");
						dispatcher.forward(request,response);
			     }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
