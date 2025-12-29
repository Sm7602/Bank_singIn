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

}
