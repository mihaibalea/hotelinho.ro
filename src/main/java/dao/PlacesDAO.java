package dao;

import java.util.List;

import dao.model.PlaceToVisitDTO;

public interface PlacesDAO {
	public List<PlaceToVisitDTO> getPlacesForHotel(String id);

}
