package com.model;
// Generated 08-Apr-2022, 8:53:49 pm by Hibernate Tools 5.6.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private Integer productId;
	private Brand brand;
	private Cloth cloth;
	private String productTitle;
	private String productDescription;
	private String productPhoto;
	private Integer productPrice;
	private Integer productDiscount;
	private Integer productQuantity;
	private String productFor;
	private Set carts = new HashSet(0);
	private Set orderses = new HashSet(0);

	public Product() {
	}

	public Product(Brand brand, Cloth cloth, String productTitle, String productDescription, String productPhoto,
			Integer productPrice, Integer productDiscount, Integer productQuantity, String productFor, Set carts,
			Set orderses) {
		this.brand = brand;
		this.cloth = cloth;
		this.productTitle = productTitle;
		this.productDescription = productDescription;
		this.productPhoto = productPhoto;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
		this.productFor = productFor;
		this.carts = carts;
		this.orderses = orderses;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Cloth getCloth() {
		return this.cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}

	public String getProductTitle() {
		return this.productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductPhoto() {
		return this.productPhoto;
	}

	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}

	public Integer getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductDiscount() {
		return this.productDiscount;
	}

	public void setProductDiscount(Integer productDiscount) {
		this.productDiscount = productDiscount;
	}

	public Integer getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductFor() {
		return this.productFor;
	}

	public void setProductFor(String productFor) {
		this.productFor = productFor;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}
