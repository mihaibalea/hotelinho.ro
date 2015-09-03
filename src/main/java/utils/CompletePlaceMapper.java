package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.model.CompletePlaceDTO;
import dao.model.PlaceCloseToHotelDTO;
import dao.model.PlaceToVisitDTO;

public class CompletePlaceMapper implements RowMapper<CompletePlaceDTO> {
	public CompletePlaceDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CompletePlaceDTO completePlace = new CompletePlaceDTO();
		PlaceToVisitDTO placeToVisit = new PlaceToVisitDTO();
		PlaceCloseToHotelDTO placeCloseToHotel = new PlaceCloseToHotelDTO();

		placeToVisit.setId(rs.getString("id"));
		placeToVisit.setName(rs.getString("name"));
		placeToVisit.setAddress(rs.getString("address"));
		placeToVisit.setType(rs.getString("type"));
		placeToVisit.setCarAcces(rs.getString("carAcces").equals("YES"));
		placeToVisit.setDescription(rs.getString("description"));
		placeToVisit.setLat(rs.getString("lat"));
		placeToVisit.setLng(rs.getString("lng"));
		placeToVisit.setPhoto(rs.getString("photo"));
		placeToVisit.setDetailsUrl(rs.getString("detailsUrl"));
		placeCloseToHotel.setId(rs.getString("idd"));
		placeCloseToHotel.setPlaceId(rs.getString("placeId"));
		placeCloseToHotel.setHotelId(rs.getString("hotelId"));
		placeCloseToHotel.setDistance(rs.getInt("distance"));
		placeCloseToHotel.setGuidance(rs.getString("guidance"));
		placeCloseToHotel.setSpecifications(rs.getString("specifications"));

		completePlace.setPlaceToVisit(placeToVisit);
		completePlace.setPlaceCloseToHotel(placeCloseToHotel);

		return completePlace;
	}

}
