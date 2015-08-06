package dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.PlacesDAO;
import dao.model.CompletePlaceDTO;
import utils.CompletePlaceMapper;

public class PlacesDAOImpl implements PlacesDAO {
	@Autowired
	private JdbcTemplate jdbc;
	private static final Logger LOGGER = LoggerFactory.getLogger(PlacesDAOImpl.class);

	public List<CompletePlaceDTO> getPlacesForHotel(String id) {
		String sql = "select *  from placestovisit pl,placesclosetohotels p where p.placeId=pl.id and p.hotelId=?";
		List<CompletePlaceDTO> list = jdbc.query(sql, new Object[] { id }, new CompletePlaceMapper());
		LOGGER.debug("Returned " + list);
		return list;
	}

}
