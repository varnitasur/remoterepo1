
public class Repoters {

	int reporterid;
	String reportername;
	String projectname;
	public int getReporterid() {
		return reporterid;
	}
	public void setReporterid(int reporterid) {
		this.reporterid = reporterid;
	}
	public String getReportername() {
		return reportername;
	}
	public void setReportername(String reportername) {
		this.reportername = reportername;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public Repoters(int reporterid, String reportername, String projectname) {
		super();
		this.reporterid = reporterid;
		this.reportername = reportername;
		this.projectname = projectname;
	}
	public Repoters() {
		
	}
	
}
