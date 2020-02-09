package DAO;

import java.util.List;

import Presentation.Client;

public interface ClientDAO {

	public List<Client> getAllClient();
	public Client getClient(int id);
	public void addClient(Client client);
	public void updateClient(Client client);
	public void deleteClient(Client client);
	
}
