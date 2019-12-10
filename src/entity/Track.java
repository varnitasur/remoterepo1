package entity;

import java.util.Set;

public class Track {
	private int trackId;
	private String trackName;
	private Set<Capability> capabilities;

	public Track() {
		super();
	}

	public Track(int trackId, String trackName, Set<Capability> capabilities) {
		super();
		this.trackId = trackId;
		this.trackName = trackName;
		this.capabilities = capabilities;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public Set<Capability> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Set<Capability> capabilities) {
		this.capabilities = capabilities;
	}

}
