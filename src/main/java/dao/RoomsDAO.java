package dao;

import java.util.List;

import dao.model.RoomDTO;

public interface RoomsDAO {
	public List<RoomDTO> getRoomsForHotel(String id);

}
