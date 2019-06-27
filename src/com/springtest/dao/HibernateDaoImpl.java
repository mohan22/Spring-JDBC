package com.springtest.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;

	public int getCircleCount() {
		String hql = "select count (*) from Circle";
		Query query = sessionFactory.openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();

	}

}
