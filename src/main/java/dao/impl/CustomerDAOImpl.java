package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.CustomersDAO;
import dao.model.CustomerDTO;

public class CustomerDAOImpl implements CustomersDAO {
	@Autowired
	private JdbcTemplate jdbc;

	public void addNewCustomer(CustomerDTO customerDTO) {
		String sql = "insert into customers values(?,?,?,?,?,?,?,?,?) ";
		jdbc.update(sql, customerDTO.getId(), customerDTO.getName(), customerDTO.getCnp(), customerDTO.getAddress(),
				customerDTO.getNationality(), customerDTO.getPhone(), customerDTO.getUsername(),
				customerDTO.getPassword(), customerDTO.getRegistrationDate());
	}

}
