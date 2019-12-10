package com.mindtree.clientportal.service;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.clientportal.dao.daoimpl.ClientDaoImpl;
import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;
import com.mindtree.clientportal.exception.DaoException;
import com.mindtree.clientportal.exception.NoSuchClientException;
import com.mindtree.clientportal.exception.NoSuchCompanyException;
import com.mindtree.clientportal.exception.ServiceException;

public class ClientServiceImpl {

	static ClientDaoImpl obj = new ClientDaoImpl();

	public List<Company> getallcompanydetials() throws ServiceException {
		// TODO Auto-generated method stub
		List<Company> result;
		try {
			result = obj.getcompany();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
			}
		return result;
	}

	public List<Client> getallclientdetials() throws ServiceException {
		// TODO Auto-generated method stub
		List<Client> result=null;
		try {
			result = obj.getclient();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
		return result;
	}

	public void update(int cid, int clientid) throws ServiceException,NoSuchClientException,NoSuchCompanyException{
		List<Company> result;
		int count = 0, count1 = 0;
		try {
			result = obj.getcompany();
			List<Client> result1 = obj.getclient();
			for (Client client : result1) {
				if (client.getClientid() == clientid) {
					count = 1;
					for (Company c : result) {
						if (c.getCompanyid() == cid) {
							count1 = 1;
							obj.addClientDetails(cid, clientid);

						}

					}
				}

			}

		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
				if(count==0)
					throw new NoSuchClientException("No Such Client");

if(count1==0)
	throw new NoSuchCompanyException("No Such company");
	}

	public List<Client> getallclientdetials(int companyid) throws ServiceException,NoSuchClientException {
		List<Client> list = new ArrayList<Client>();
		int count = 0;

		List<Client> result=null;
		try {
			result = obj.getclient();
			for (Client client : result) {
				if (client.getCompanyid() == companyid) {
					count = 1;
					Client c = new Client();
					c.setClientid(client.getClientid());
					c.setClientname(client.getClientname());
					c.setClientbudget(client.getClientbudget());
					c.setCompanyid(client.getCompanyid());
					list.add(c);
				}
			}
		
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
		if (count == 0) {
			throw new NoSuchClientException("No client Found");
		}
		return list;
	}

	public void update1(int budget, int clientid) throws ServiceException {
		try {
			obj.updatebudget(budget, clientid);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}

	}

}
