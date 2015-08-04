package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.CustomersDAO;
import dao.model.CustomerDTO;
import utils.CustomerMapper;

public class CustomerDAOImpl implements CustomersDAO {
	@Autowired
	private JdbcTemplate jdbc;

	public void addNewCustomer(CustomerDTO customerDTO) {
		String sql = "insert into customers values(?,?,?,?,?,?,?,?,?) ";
		jdbc.update(sql, customerDTO.getId(), customerDTO.getName(), customerDTO.getCnp(), customerDTO.getAddress(),
				customerDTO.getNationality(), customerDTO.getPhone(), customerDTO.getUsername(),
				customerDTO.getPassword(), customerDTO.getRegistrationDate());
	}

	public CustomerDTO logIn(String username, String password) {
		String sql = "select count(id) from customers where username=? and password=?";
		String sql2 = "select * from customers where username=?";
		int count = jdbc.queryForObject(sql, new Object[] { username, password }, Integer.class);
		if (count == 0) {
			return null;

		}
		return jdbc.queryForObject(sql2, new Object[] { username }, new CustomerMapper());

	}

}
