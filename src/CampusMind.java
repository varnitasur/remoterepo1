
public class CampusMind {
	 String mid;
	 String Cname;
	 String cAddress;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public CampusMind(String mid, String cname, String cAddress) {
		super();
		this.mid = mid;
		Cname = cname;
		this.cAddress = cAddress;
	}
	public CampusMind() {
	}
	 

}
