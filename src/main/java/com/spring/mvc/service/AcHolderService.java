package com.spring.mvc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.AcHolderDao;
import com.spring.mvc.model.AcHolder;


@Service

public class AcHolderService {
	
	@Autowired
	private AcHolderDao acDao;
	
	@Transactional
	public void saveAcHolder(AcHolder acHolder) {
		System.out.println("service.saveacholderService()");
		if (acHolder != null) {
			acDao.saveAcHolder(acHolder);
		}
	}
	
	@Transactional
	public AcHolder getAcHolderbyId(int id) {
		System.out.println("getAcHolderbyId.Service()");
			return acDao.getAcHolderbyId(id);
	}
	
	@Transactional
	public AcHolder removeAcHolderbyId(int id) {
		System.out.println("removeAcHolderbyId.Service()");
			return acDao.removeAcHolderbyId(id);
	}
	
	@Transactional
	public AcHolder updateAcHolderbyId(int id) {
		System.out.println("updateAcHolderbyId.Service()");
			return acDao.updateAcHolderbyId(id);
	}

}
