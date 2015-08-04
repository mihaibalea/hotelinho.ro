package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.model.CustomerDTO;

public class CustomerMapper implements RowMapper<CustomerDTO> {
	public CustomerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(rs.getString("id"));
		customerDTO.setName(rs.getString("name"));
		customerDTO.setCnp(rs.getString("cnp"));
		customerDTO.setAddress(rs.getString("address"));
		customerDTO.setNationality(rs.getString("nationality"));
		customerDTO.setPhone(rs.getString("phone"));
		customerDTO.setUsername(rs.getString("username"));
		customerDTO.setPassword(rs.getString("password"));
		customerDTO.setRegistrationDate(rs.getDate("registrationDate"));

		return customerDTO;
	}

}
