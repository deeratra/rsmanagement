package com.cts.foodster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.foodster.bean.Login;
import com.cts.foodster.dao.RegistrationDAO;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistraionService {

	@Autowired
	RegistrationDAO registrationDAO;
	
	public String registerAdmin(Login login) {
		// TODO Auto-generated method stub
		return registrationDAO.registerAdmin(login);
	}

}
