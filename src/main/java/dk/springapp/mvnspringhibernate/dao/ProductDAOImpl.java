package dk.springapp.mvnspringhibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import dk.springapp.mvnspringhibernate.entity.Product;

public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory hibernateFactory;

	@Override
	public void addNewProduct(int catId, int prodId, String prodName, String prodDesc, String prodImgUrl,
			int prodPrice) {
		// TODO Auto-generated method stub
		
		Product objProd = new Product(catId, prodId, prodName, prodDesc, prodImgUrl, prodPrice);
		
		
		try(Session hibernateSession = hibernateFactory.openSession()){
			hibernateSession.beginTransaction();
			hibernateSession.save(objProd);
			hibernateSession.getTransaction().commit();
		}catch(HibernateException hbe) {
			hbe.printStackTrace();
		}
		
		

	}

	@Override
	public List<Product> getAllProds() {
		// TODO Auto-generated method stub
		try(Session hibernateSession = hibernateFactory.openSession()){
			
			Query<Product> query = hibernateSession.createQuery("from Product");
			return query.getResultList();
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Product getProdById(int prodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
