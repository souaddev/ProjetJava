package DAO;

import Presentation.Client;

public class Test {

	public static void main(String[] args) {
		
		Client c1=new Client(5,"client889","JSJHHJ","jdj");
		Client c2=new Client(2,2,"client444","souad","szaeiohfz");
		ClientDAOImp client1=new ClientDAOImp();
		client1.addClient(c1);
		//client1.updateClient(c2);
		//client1.deleteClient(c2);
		System.out.println(client1.getAllClient());
	
	}

}
