package dao;

import java.util.List;

import dao.model.CompletePlaceDTO;

public interface PlacesDAO {
	public List<CompletePlaceDTO> getPlacesForHotel(String id);

}
