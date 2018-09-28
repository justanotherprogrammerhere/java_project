/**
 * 
 */
package com.justanotherprogrammerhere.project1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justanotherprogrammerhere.project1.dao.UserDao;
import com.justanotherprogrammerhere.project1.model.UserDetails;
import com.justanotherprogrammerhere.project1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserDetails> getUserDetails() {
		return userDao.getUserDetails();

	}

}
