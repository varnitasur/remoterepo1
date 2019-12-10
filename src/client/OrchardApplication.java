package client;

import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

import entity.Capability;
import entity.Observation;
import entity.Track;
import service.TrackService;
import service.seviceimpl.TrackServiceImpl;

public class OrchardApplication {
	static Scanner sc = new Scanner(System.in);
	static TrackServiceImpl ts = new TrackServiceImpl();

	public static void main(String[] args) {

		System.out.println("Enter track count:");
		int count = sc.nextInt();
		// create Tracks
		Set<Track> tracks = createTracks(count);

		// ask user for track id for which he needs list of capabilities and
		// observations

		System.out.println("Enter track ID:");
		int trackId = sc.nextInt();
		Set<Capability> capabilities = ts.getCapabilitiesByTrack(tracks, trackId);
		
		
		
		for (Capability capability : capabilities) {
			System.out.println("Detail of capability");
			System.out.println("====================");
			System.out.println("Capability ID :" + capability.getCapabilityId());
			System.out.println("Capability name :" + capability.getCapabilityName());
			System.out.println("Capability status :" + capability.getStatus());
			Set<Observation> obs = capability.getObservations();
			for (Observation observation : obs) {
				System.out.println("Detail of Observation");
				System.out.println("====================");
				System.out.println("Observation ID :" + observation.getObservationId());
				System.out.println("Observation name :" + observation.getObservatioName());

			}

		}

		// ask user for track name for which he needs list of capabilities and
		// observations
		System.out.println("Enter track name:");
		String trackName = sc.next();
		
		Set<Capability> capabilities1 = ts.getCapabilitiesByTrack(tracks, trackName);
		
		for (Capability capability : capabilities1) {
			System.out.println("Detail of capability");
			System.out.println("====================");
			System.out.println("Capability ID :" + capability.getCapabilityId());
			System.out.println("Capability name :" + capability.getCapabilityName());
			System.out.println("Capability status :" + capability.getStatus());
			Set<Observation> obs = capability.getObservations();
			for (Observation observation : obs) {
				System.out.println("Detail of Observation");
				System.out.println("====================");
				System.out.println("Observation ID :" + observation.getObservationId());
				System.out.println("Observation name :" + observation.getObservatioName());

			}
		}	
		// get all capabilities whose status is learn
	}

	private static Set<Track> createTracks(int count) {
		Set<Track> result = new HashSet<>();
		for (int i = 0; i < count; i++) {
			// ask for id name
			System.out.println("Enter details for " + (i + 1) + " th track");
			System.out.println("===========================================");
			System.out.println("Enter track ID:");
			int id = sc.nextInt();
			System.out.println("Enter track Name:");
			String name = sc.next();
			
			System.out.println("Enter Capability count for this track:");
			int capabilityCount = sc.nextInt();
			// create capability
			Set<Capability> capabilities = createcapabilities(capabilityCount);

			Track track = new Track(id, name, capabilities);
			result.add(track);
		}

		return result;
	}

	private static Set<Capability> createcapabilities(int capabilityCount) {
		Set<Capability> result = new HashSet<>();
		for (int i = 0; i < capabilityCount; i++) {
			// ask for id name
			System.out.println("Enter details for " + (i + 1) + " th Capability");
			System.out.println("===========================================");
			System.out.println("Enter Capability ID:");
			int id = sc.nextInt();
			System.out.println("Enter Capability Name:");
			String name = sc.next();
			System.out.println("Enter Capability status:");
			String status = sc.next();
			System.out.println("Enter Observation count for this Capability:");
			int observationCount = sc.nextInt();
			// create observation
			Set<Observation> observations = createObservations(observationCount);

			Capability capability = new Capability(id, name, status, observations);
			result.add(capability);
		}

		return result;
	}

	private static Set<Observation> createObservations(int observationCount) {
		Set<Observation> result = new HashSet<>();
		for (int i = 0; i < observationCount; i++) {
			// ask for id name
			System.out.println("Enter details for " + (i + 1) + " th Observation");
			System.out.println("===========================================");
			System.out.println("Enter Observation ID:");
			int id = sc.nextInt();
			System.out.println("Enter Observation Name:");
			String name = sc.next();

			Observation observation = new Observation(id, name);
			result.add(observation);
		}

		return result;
	}

}
