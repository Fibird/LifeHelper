package cc.chaoyangliu.zipCodeSearch;

public class ResultInfo {
	String address;
	String zipCode;
	public ResultInfo() {
		// TODO Auto-generated constructor stub
		address = new String();
		zipCode = new String();
	}
	@Override
	public String toString() {
		return address + "||" + zipCode;
	}
	
}
