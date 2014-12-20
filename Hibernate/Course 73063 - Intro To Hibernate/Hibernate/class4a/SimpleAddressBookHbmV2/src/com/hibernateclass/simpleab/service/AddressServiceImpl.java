package com.hibernateclass.simpleab.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hibernateclass.simpleab.dao.AddressDao;
import com.hibernateclass.simpleab.dao.AddressDaoHbmImpl;
import com.jdbcstarter.simpleab.dao.AddressDaoJdbcImpl;
import com.hibernateclass.simpleab.model.Address;

public class AddressServiceImpl implements AddressService {
	private static final Logger logger = Logger.getLogger(AddressServiceImpl.class);
	AddressDao addressDao = new AddressDaoHbmImpl();
	
	// *** Uncomment this if you use JDBC
	//AddressDao addressDao = new AddressDaoJdbcImpl();

	public AddressServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Address address) {
		if (0 == address.getPersonId()) addressDao.persist(address);
		else addressDao.update(address);
		logger.trace("Persisted: " + address);
	}

	@Override
	public Address get(Address address) {
		Address returnAddress = addressDao.get(address.getPersonId());
		logger.trace("Retrieved: " + returnAddress);
		return returnAddress;
	}

	@Override
	public List<Address> list() {
		ArrayList<Address> locations = null;
		locations = (ArrayList<Address>) addressDao.list();
		logger.debug("locations list() size is " + locations.size());
		return locations;
	}

	@Override
	public void remove(Address address) {
		addressDao.delete(address);
		logger.trace("Deleted: " + address);
	}

}
