package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.spring.mvc.model.AcHolder;

@Repository
public class AcHolderDao {
	
	@Autowired
	private final HibernateTemplate hibernateTemplate;
	
	public AcHolderDao(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}
	

	public void saveAcHolder(AcHolder acholder)
	{
		System.out.println("AcHolderDao.saveAcHolder()");
		hibernateTemplate.save(acholder);
	}

}
