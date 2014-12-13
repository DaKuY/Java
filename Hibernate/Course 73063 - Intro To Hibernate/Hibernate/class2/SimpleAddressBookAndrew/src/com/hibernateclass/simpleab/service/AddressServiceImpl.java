package com.hibernateclass.simpleab.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hibernateclass.simpleab.model.Address;

public class AddressServiceImpl implements AddressService {

	public AddressServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		System.out.println(address);

	}

	@Override
	public Address get(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> list() {
		// TODO Auto-generated method stub
		ArrayList<Address> locations = new ArrayList<Address>();
		Address address = new Address();
		
		address.setStreet("123 Street");
		address.setCity("Plano");
		address.setState("TX");
		address.setZipCode("75023");
		
		locations.add(address);
		address = new Address();
				
		address.setStreet("456 Avenue");
		address.setCity("Frisco");
		address.setState("TX");
		address.setZipCode("75034");
		
		locations.add(address);
		
		return locations;
	}

	@Override
	public void remove(Address address) {
		// TODO Auto-generated method stub

	}

}
