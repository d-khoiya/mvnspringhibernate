package dk.springapp.mvnspringhibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dk.springapp.mvnspringhibernate.config.AppConfigurator;
import dk.springapp.mvnspringhibernate.dao.CategoryDAO;
import dk.springapp.mvnspringhibernate.dao.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurator.class)){
    	   CategoryDAO dao = (CategoryDAO)context.getBean("objCategory");
    	   ProductDAO dao2 = (ProductDAO)context.getBean("objProdcut");
    	   //dao2.addNewProduct(6, 90, "booksnew", "bookkkkk", "bbbbb", 111);
    	 
    	  // dao.addNewCategory(52, "tstingiii", "testeriii", "tstii");
    	   System.out.println("Inserted Successfully!!!!");
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
