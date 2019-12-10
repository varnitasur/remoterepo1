
public class Manager {

	int managerid;
	String managername;
	Repoters[] repoter;
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public Repoters[] getRepoter() {
		return repoter;
	}
	public void setRepoter(Repoters[] repoter) {
		this.repoter = repoter;
	}
	public Manager(int managerid, String managername, Repoters[] repoter) {
		super();
		this.managerid = managerid;
		this.managername = managername;
		this.repoter = repoter;
	}
	public Manager() {
	}
	
	
}
