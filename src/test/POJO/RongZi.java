package test.POJO;

public class RongZi {

	private int RongziID;
	private String RongziName;
	private String status;
	public int getRongziID() {
		return RongziID;
	}
	public void setRongziID(int rongziID) {
		RongziID = rongziID;
	}
	public String getRongziName() {
		return RongziName;
	}
	public void setRongziName(String rongziName) {
		RongziName = rongziName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RongZi [RongziID=" + RongziID + ", RongziName=" + RongziName + ", status=" + status + "]";
	}
	
}
