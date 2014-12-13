package com.hibernateclass.simpleab.dao;

import java.util.List;
import com.hibernateclass.simpleab.model.Address;

public interface AddressDao {
	
	public void persist(Address address);
	public Address get(int personId);
	public void update(Address address);
	public void delete(Address address);
	public List<Address> list();

}
