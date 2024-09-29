package com.ex5;
import java.util.*;

public class mainex5 {

	public static void main(String[] args) 
	{
		inventory i=new inventory();
		product p=new product();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user 1:Admin 2:Nomal user");
		int v=sc.nextInt();
		if(v==1)
		{
			System.out.println("Enter name and password :");
			String na=sc.next();
			String pass=sc.next();
			login l;
			l=new login();
			l.setName(na);
			l.setPassword(pass);
			if(l.getName().equals("Yukesh") && l.getPassword().equals("Ynny0"))
			{
				System.out.println("1.Add 2.Update 3.Remove 4.Search 5.Show");
        		int op=sc.nextInt();
	        	do {
	        		
			
					switch(op)
					{
					case 1:
						/*p=new product();
						System.out.println("Enter name type and cost");
						String name=sc.next();
						String type=sc.next();
						int cost=sc.nextInt();
						p.setPname(name);
						p.setPtype(type);
						p.setPcost(cost);
						p.setPid();
						i.add(p);*/
						System.out.println("Enter the pname ptype and pcost of the coffee :");
						p.setPname(sc.next());
						p.setPtype(sc.next());
						p.setPcost(sc.nextInt());
						p.setPid(i.gen(p));
						i.add(p);
						break;
						
					case 2:
						i.show();
						/*String id=sc.next();
						p=i.search(id);
						System.out.println("WHat to update : 1:Name 2:type 3:Cost");
						int x=sc.nextInt();
						if(x==1)
						{
							String y=sc.next();
							p.setPname(y);
							i.update();
							
							
						}
						
						else if(x==2)
						{
							String y=sc.next();
							p.setPtype(y);
							i.update();
						}
						
						else if(x==3)
						{
							int y=sc.nextInt();
							p.setPcost(y);
							i.update();
						}
						else
						{
							System.out.println("Invalid");
						}*/
						System.out.println("Enter the id to update :");
						String x=sc.next();
						p.setPid(x);
						p.setPname(sc.next()+sc.nextLine());
						i.update(p);
						break;
						
					case 3:
						i.show();
						System.out.println("ENter pid :");
						String x1=sc.next();
						i.remove(x1);
						break;
						
					case 4:
						System.out.println("ENter pid :");
						String iv=sc.next();
						p=i.search(iv);
						System.out.println("Product name :"+p.getPname());
						System.out.println("Product type :"+p.getPtype());
						System.out.println("Product cost :"+p.getPcost());
						System.out.println("Product id :"+p.getPid());
						break;
						
					case 5:
						i.show();
						break;
					}//switch
					System.out.println("1.Add 2.Update 3.Remove 4.Search 5.Show -1:to end");
					op=sc.nextInt();
	        	
	        	}while(op!=-1);//while
			}//if
	        	
				else
				{
					System.out.println("You are not admin please choose normal user portal");
				}
			}
			
			else if(v==2)
			{
				i.show();
			}
		
			else
			{
				System.out.println("Invalid user");
			}
			
	}

}
