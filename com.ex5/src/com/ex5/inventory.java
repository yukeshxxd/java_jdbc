package com.ex5;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class inventory {
	List<product> list=new ArrayList<>();
	Statement stmt;
	ResultSet rs;
	int count;
	String qry=null;
	db_util db=new db_util();
	Connection con;
	void add(product p)
	{
		//list.add(p);
		try {
			Connection con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("insert into coffee_product(pid,pname,ptype,pcost) values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPtype()+"','"+p.getPcost()+"')");
			
		if(count==1)
		{
			System.out.println("Inserted");
		}
		else {
			System.out.println("Errorrrrrr!!!!!!!!");
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void show()
	{
		/*System.out.println(list);
		for(product p:list)
		{
			System.out.println("Product name :"+p.getPname());
			System.out.println("Product type :"+p.getPtype());
			System.out.println("Product cost :"+p.getPcost());
			System.out.println("Product id :"+p.getPid());
		}*/
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from coffee_product");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			}
		}catch(Exception e)
		{
			System.out.println("e.getMessage()");
		}
		
	}
	
	product search(String id)
	{
		for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getPid()))
			{
				return list.get(i);
			}
		}
		return null;
	}
	
	void update(product p)
	{
		//System.out.println("Updateddddd Successfully raaa !!!!!!!!!!!");
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("Update coffee_product set pname='"+p.getPname()+"' Where pid='"+p.getPid()+"'");
			System.out.println("Updated");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	void remove(String id)
	{
		/*for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getPid()))
					{
			           list.remove(i);
			           
					}
		}*/
		
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("DELETE from coffee_product where pid='"+id+"'");
			System.out.println("Deleted");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	String gen(product p) {
		String id=p.getPname().substring(0,3)+p.getPtype().substring(2,4);
		return id;
	}
	
}

