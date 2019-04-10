package com.cts.foodster.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.foodster.bean.Login;

@Repository("registrationDAO")
public class RegistraionDAOImpl implements RegistrationDAO{
	@Autowired
	SessionFactory sessionFactory;

	public String registerAdmin(Login login) {
		
		sessionFactory.getCurrentSession().save(login);
		return "yes";
		
		
		
		
	}

}
