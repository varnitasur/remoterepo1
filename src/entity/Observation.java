package entity;

public class Observation {
	private int observationId;
	private String observatioName;

	public Observation() {
		super();
	}

	public Observation(int observationId, String observatioName) {
		super();
		this.observationId = observationId;
		this.observatioName = observatioName;
	}

	public int getObservationId() {
		return observationId;
	}

	public void setObservationId(int observationId) {
		this.observationId = observationId;
	}

	public String getObservatioName() {
		return observatioName;
	}

	public void setObservatioName(String observatioName) {
		this.observatioName = observatioName;
	}

}
