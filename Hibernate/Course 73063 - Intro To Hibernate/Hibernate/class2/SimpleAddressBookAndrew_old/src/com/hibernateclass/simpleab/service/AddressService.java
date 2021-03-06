package com.hibernateclass.simpleab.service;

import java.util.List;
import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;

public interface AddressService {
	
	public void save(Address address);
	public Address get(Address address);
	public List<Address> list();
	public void remove(Address address);

}
