package dk.springapp.mvnspringhibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import dk.springapp.mvnspringhibernate.entity.Category;



public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory hibernateFactory;
	
	
	@Override
	public void addNewCategory(int catId, String catName, String catDesc, String catImgUrl) {
		Category objCat = new Category(catId,catName, catDesc,catImgUrl);
		
		try(Session hibernateSession = hibernateFactory.openSession();){
			hibernateSession.beginTransaction();
			hibernateSession.save(objCat);
			hibernateSession.getTransaction().commit();
		}catch(HibernateException hbe) {
			hbe.printStackTrace();
		}
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getGategoryById(int catId) {
		// TODO Auto-generated method stub
		return null;
	}

}
