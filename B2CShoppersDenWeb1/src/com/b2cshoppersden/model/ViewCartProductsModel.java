package com.b2cshoppersden.model;

public class ViewCartProductsModel {
	
	   public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	private int productId;
	   private String productImageUrl;
	   private String productDescription;
	   private double productPrice;
	   private String productCategory;
	   private String productName;
	@Override
	public String toString() {
		return "ViewCartProductsModel [productId=" + productId + ", productImageUrl=" + productImageUrl
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productCategory="
				+ productCategory + ", productName=" + productName + "]";
	}

}
