package dao;

import dao.model.CustomerDTO;

public interface CustomersDAO {
	public void addNewCustomer(CustomerDTO customerDTO);
	public CustomerDTO logIn(String username, String password);

}
