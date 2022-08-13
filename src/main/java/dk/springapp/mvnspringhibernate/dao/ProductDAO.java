package dk.springapp.mvnspringhibernate.dao;

import java.util.List;

import dk.springapp.mvnspringhibernate.entity.Product;

public interface ProductDAO {
	public void addNewProduct(int catId, int prodId, String prodName, String prodDesc, String prodImgUrl, int prodPrice);
	public List<Product> getAllProds();
	public Product getProdById(int prodId); 
}
