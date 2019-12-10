
public class Players {

	int id;
	String pname;
	String padd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public Players() {
	
	}
	public Players(int id, String pname, String padd) {
		super();
		this.id = id;
		this.pname = pname;
		this.padd = padd;
	}
	
}
