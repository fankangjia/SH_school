package test.POJO;

public class NewsType {

	private int typeID;
	private String typeName;
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "NewsType [typeID=" + typeID + ", typeName=" + typeName + "]";
	}
	
}
