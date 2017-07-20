package com.xc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xc.entity.User;

@Component
public class UserDao {
  
	/*@Resource
	SessionFactory sessionFactory;
	
	public List<User> getAllUsers(){
		return sessionFactory.getCurrentSession().createQuery("from user").list();
	}*/

}
