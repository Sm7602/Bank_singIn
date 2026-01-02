package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.spring.mvc.model.AcHolder;

@Repository
public class AcHolderDao {
	
	@Autowired
	private final HibernateTemplate hibernateTemplate;
	
	public AcHolderDao(HibernateTemplate hibernateTemplate){
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveAcHolder(AcHolder acholder){
		System.out.println("AcHolderDao.saveAcHolder()");
		hibernateTemplate.save(acholder);
	}
	
	public AcHolder getAcHolderbyId(int id){
		System.out.println("AcHolderDao.getAcHolderbyid()");
		return hibernateTemplate.get(AcHolder.class, id);
	}
	
	public AcHolder removeAcHolderbyId(int id){
		System.out.println("AcHolderDao.removeAcHolderbyid()");
		AcHolder acHolder = hibernateTemplate.get(AcHolder.class, id);
	    if (acHolder != null) {
	        hibernateTemplate.delete(acHolder);
	    }
	    return acHolder;
	}
	
	public AcHolder updateAcHolderbyId(int id){
		System.out.println("AcHolderDao.updateAcHolderbyid()");
		AcHolder acHolder = hibernateTemplate.get(AcHolder.class, id);
	    if (acHolder != null) {
	        hibernateTemplate.update(acHolder);
	    }
	    return acHolder;
	}
   
}
