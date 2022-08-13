package dk.springapp.mvnspringhibernate.config;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import dk.springapp.mvnspringhibernate.dao.CategoryDAO;
import dk.springapp.mvnspringhibernate.dao.CategoryDAOImpl;
import dk.springapp.mvnspringhibernate.dao.ProductDAO;
import dk.springapp.mvnspringhibernate.dao.ProductDAOImpl;


@org.springframework.context.annotation.Configuration
@PropertySource("classpath:hibernatecfg.properties")
public class AppConfigurator {
	
	@Autowired
	Environment env;
	
	@Bean
	public Configuration config() {
		Configuration config = new Configuration();
		config.configure(env.getProperty("hibernatecfg.configFile"));
		return config;
	}
	
	@Bean
	public SessionFactory hibernateFactory(Configuration config) {
		return config.buildSessionFactory();
	}
	
	@Bean
	public CategoryDAO objCategory() {
		return new CategoryDAOImpl();
	}
	
	@Bean
	public ProductDAO objProdcut() {
		return new ProductDAOImpl();
	}
}
