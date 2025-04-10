class Test01Sub{
	public static String pathStr = "";
	
	public Test01Sub() {
		// TODO Auto-generated constructor stub
		pathStr = "1111";
	}
	
}
public class Test01 extends Test01Sub{
	
	public static String root_dir = "";

	

	public static void setRoot_dir(String root_dir) {
		Test01.root_dir = "1111111111111111";
	}
	
	
	



	public static String getRoot_dir() {
		return root_dir;
	}






	public static void main(String[] args) {
		setRoot_dir("");
		Test01 test01 = new Test01();
		System.out.println("DDDD:::"+test01.pathStr);
		// TODO Auto-generated method stub

	}

}
