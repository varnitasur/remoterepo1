package com.mindtree.clientportal.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.clientportal.dao.ClientDao;
import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;
import com.mindtree.clientportal.exception.DaoException;
import com.mindtree.clientportal.utility.DBUtility;


public class ClientDaoImpl implements ClientDao {
	
	static DBUtility obj= new DBUtility();
	public List<Client> getclient() throws DaoException {
		Connection con=obj.getConnection();
		String query="select * from client";
		Statement st=null;
		ResultSet rs=null;
		List<Client> result=new ArrayList<Client>();
		try {
			st=con.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int budget=rs.getInt(3);
				int cid=rs.getInt(4);
				Client c=new Client(id, name, budget, cid);
				result.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e.getMessage());
		}
		return result;
		
	}
	public List<Company> getcompany() throws DaoException {
		Connection con=obj.getConnection();
		String query="select * from company";
		Statement st=null;
		ResultSet rs=null;
		List<Company> result=new ArrayList<Company>();
		try {
			st=con.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				Company c=new Company(id, name);
				result.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e.getMessage());
		}
		return result;
		
	}
	public void  addClientDetails(int companyid,int clientid) throws DaoException {
		
		
		Connection con=obj.getConnection();
		String query="update client set company_id=? where client_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,companyid);
			ps.setInt(2, clientid);
				ps.executeUpdate();
				
				
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e.getMessage());
		}
		
	}
public void  updatebudget(int budget,int clientid) throws DaoException {
		
		
		Connection con=obj.getConnection();
		String query="update client set budget=? where client_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,budget);
			ps.setInt(2, clientid);
				ps.executeUpdate();
				
				
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e.getMessage());
		}
		
	}
		
		
	}
	
	
	


