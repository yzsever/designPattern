package dp.yzs.adapter.basketball;

public class ForeignCenter {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attackChinese() {
		System.out.println("Chinese Center "+name+" attack");
	}
	
	public void defenseChinese() {
		System.out.println("Chinese Center "+name+" defense");
	}
}
