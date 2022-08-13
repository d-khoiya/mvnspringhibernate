package dk.springapp.mvnspringhibernate.dao;

import java.util.List;

import dk.springapp.mvnspringhibernate.entity.Category;

public interface CategoryDAO {
	public void addNewCategory(int catId, String catName, String catDesc, String catImgUrl);
	public List<Category> getAllCategories();
	public Category getGategoryById(int catId); 
	
}
