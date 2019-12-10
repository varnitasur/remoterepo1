package service;

import java.util.Set;

import entity.Capability;
import entity.Track;

public interface TrackService {
	// get all capabilities by trackID
	Set<Capability> getCapabilitiesByTrack(Set<Track> tracks, int id);

	// get all capabilities by trackName
	Set<Capability> getCapabilitiesByTrack(Set<Track> tracks, String name);
}
