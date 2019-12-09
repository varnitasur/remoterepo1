package com.mindtree.clientportal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;
import com.mindtree.clientportal.exception.NoSuchClientException;
import com.mindtree.clientportal.exception.NoSuchCompanyException;
import com.mindtree.clientportal.exception.ServiceException;
import com.mindtree.clientportal.service.ClientServiceImpl;

@RestController
public class Controller {

	ClientServiceImpl obj = new ClientServiceImpl();

	@GetMapping("/getmsg")
	public List<Company> getallcompanydetials() {

		List<Company> result = null;
		try {
			result = obj.getallcompanydetials();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return result;

	}

	@GetMapping("/getmessage")
	public List<Client> getallclientdetials() {

		List<Client> result = null;
		try {
			result = obj.getallclientdetials();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return result;

	}

	@GetMapping("/getmsg/{companyid}")
	public List<Client> getallclientdetials(@PathVariable int companyid) {

		List<Client> result = null;
		try {
			result = obj.getallclientdetials(companyid);
		} catch (NoSuchClientException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return result;

	}

	@PutMapping("/update/{cid}/{clientid}")
	public String update(@PathVariable int cid, @PathVariable int clientid) {

		try {
			obj.update(cid, clientid);
			return "updated";
		} catch (NoSuchClientException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NoSuchCompanyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		 catch (ServiceException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		return "Exception";
	}

	@PutMapping("/update1/{budget}/{clientid}")
	public String updatebudget(@PathVariable int budget, @PathVariable int clientid) {

		try {
			obj.update1(budget, clientid);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return "updated";

	}

}
