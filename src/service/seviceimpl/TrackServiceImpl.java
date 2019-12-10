package service.seviceimpl;

import java.util.HashSet;
import java.util.Set;

import entity.Capability;
import entity.Track;
import service.TrackService;

public class TrackServiceImpl implements TrackService {

	@Override
	public Set<Capability> getCapabilitiesByTrack(Set<Track> tracks, int id) {
		Set<Capability> result= new HashSet<>();
		for (Track track : tracks) {
			if(track.getTrackId()==id) {
				result=track.getCapabilities();
			}
			
		}
		
		
		return result;
	}

	@Override
	public Set<Capability> getCapabilitiesByTrack(Set<Track> tracks, String name) {
		Set<Capability> result= new HashSet<>();
		for (Track track : tracks) {
			if(track.getTrackName().equals(name)) {
				result=track.getCapabilities();
			}
			
		}
		return result;
	}

}
