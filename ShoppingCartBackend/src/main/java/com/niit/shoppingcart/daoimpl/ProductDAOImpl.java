package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.domain.Product;

@Transactional
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Product product;

	public boolean save(Product product) {
		sessionFactory.getCurrentSession().save(product);
		return true;
	}

	public boolean update(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return false;
	}

	public Product get(String code) {
		return sessionFactory.getCurrentSession().get(Product.class, code);
	}

	public List<Product> list() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public boolean delete(String code) {
		try{
			product= get(code);
			if (product== null){
				return false;}
			sessionFactory.getCurrentSession().delete(code);
			return true;
		}
		catch (HibernateException e){
			e.printStackTrace();
			return false;
		}
	}
}
