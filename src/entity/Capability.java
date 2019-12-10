package entity;

import java.util.Set;

public class Capability {
	private int capabilityId;
	private String capabilityName;
	private String status;
	private Set<Observation> observations;

	public Capability() {
		super();
	}

	public Capability(int capabilityId, String capabilityName, String status, Set<Observation> observations) {
		super();
		this.capabilityId = capabilityId;
		this.capabilityName = capabilityName;
		this.status = status;
		this.observations = observations;
	}

	public int getCapabilityId() {
		return capabilityId;
	}

	public void setCapabilityId(int capabilityId) {
		this.capabilityId = capabilityId;
	}

	public String getCapabilityName() {
		return capabilityName;
	}

	public void setCapabilityName(String capabilityName) {
		this.capabilityName = capabilityName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Observation> getObservations() {
		return observations;
	}

	public void setObservations(Set<Observation> observations) {
		this.observations = observations;
	}

}
