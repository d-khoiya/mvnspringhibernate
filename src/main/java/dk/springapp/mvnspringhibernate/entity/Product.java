package dk.springapp.mvnspringhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Column(name="catId")
	int catId;
	
	@Id
	@Column(name="prodId")
	int prodId;
	
	@Column(name="prodName")
	String prodName;
	
	@Column(name="prodDesc")
	String prodDesc;
	
	@Column(name="prodImgUrl")
	String prodImgUrl;
	
	@Column(name="prodPrice")
	int prodPrice;

	/**
	 * @param catId
	 * @param prodId
	 * @param prodName
	 * @param prodDesc
	 * @param prodImgUrl
	 * @param prodPrice
	 */
	public Product(int catId, int prodId, String prodName, String prodDesc, String prodImgUrl, int prodPrice) {
		super();
		this.catId = catId;
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodImgUrl = prodImgUrl;
		this.prodPrice = prodPrice;
	}

	/**
	 * 
	 */
	public Product() {
		super();
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdImgUrl() {
		return prodImgUrl;
	}

	public void setProdImgUrl(String prodImgUrl) {
		this.prodImgUrl = prodImgUrl;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	

}
