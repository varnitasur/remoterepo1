
public class Room {
	String RoomName;
	CampusMind[] campusminds;
	
	public String getRoomName() {
		return RoomName;
	}

	public void setRoomName(String roomName) {
		RoomName = roomName;
	}

	public CampusMind[] getCampusminds() {
		return campusminds;
	}

	public void setCampusminds(CampusMind[] campusminds) {
		this.campusminds = campusminds;
	}
	

	public Room(String roomName, CampusMind[] campusminds) {
		super();
		RoomName = roomName;
		this.campusminds = campusminds;
	}

	public Room() {
		
	}
	
	

}

