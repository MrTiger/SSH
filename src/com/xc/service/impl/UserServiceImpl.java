package com.xc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xc.entity.User;
import com.xc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers(){
		List<User> list=new ArrayList<User>();
		Query query=sessionFactory.getCurrentSession().createQuery("from User");
		list=query.list();
		return list;
	}

}
