package com.dn.tech.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dn.tech.dao.AddressDAO;
import com.dn.tech.dao.EmployeeDAO;
import com.dn.tech.model.Address;
import com.dn.tech.model.Employee;

@Service
public class EmployeeService {
	 public EmployeeService() {
		System.out.println("Employee Service Object Created");
	}
	@Autowired
	private EmployeeDAO empdao;
	@Autowired
	private AddressDAO adddao;
	
	public void saveEmployeeRecored(Employee emp){
		empdao.save(emp);
		Iterator<Address> addressitr=emp.getAddress().iterator();
		while (addressitr.hasNext()) {
			Address address = (Address) addressitr.next();
			address.setEmployee(emp);
			adddao.save(address);
		}
		
	}
}
