package test.POJO;

public class TUser {

	private int id;
	private String name;
	private String sex;
	private String adress;
	private String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "TUser [id=" + id + ", name=" + name + ", sex=" + sex + ", adress=" + adress + ", icon=" + icon + "]";
	}
	
}
