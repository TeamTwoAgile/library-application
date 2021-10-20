package com.library.service;

import com.library.bean.Administrator;
import com.library.dao.AdministratorDao;
import com.library.exception.BaseException;

public class AdministratorService {
	private AdministratorDao administratorDao = new AdministratorDao();

	public int registerAdministrator(Administrator administrator) throws ClassNotFoundException, BaseException {
		int registerAdministrator = administratorDao.registerAdministrator(administrator);
		return registerAdministrator;
	}
}
