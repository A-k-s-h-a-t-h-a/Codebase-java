package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Supplier;

@Transactional
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired 
	private Supplier supplier;
	
	public boolean save(Supplier supplier) {
		sessionFactory.getCurrentSession().save(supplier);
		return true;
	}

	public boolean update(Supplier supplier) {
		sessionFactory.getCurrentSession().update(supplier);
		return false;
	}

	public Supplier get(String supplier_id) {
		return sessionFactory.getCurrentSession().get(Supplier.class, supplier_id);
	}

	public List<Supplier> list() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

	public boolean delete(String supplier_id) {
		try{
			supplier= get(supplier_id);
			if (supplier== null){
				return false;
			}
			sessionFactory.getCurrentSession().delete(supplier_id);
			return true;
		}
		catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
	}
}
