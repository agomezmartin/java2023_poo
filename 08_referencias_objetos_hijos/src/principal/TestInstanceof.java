package principal;

public class TestInstanceof {

	public static void main(String[] args) {
		/*Object ob="300";
		if(ob instanceof String) {
			String s=(String)ob;
			System.out.println(s);
		}else if(ob instanceof Integer) {
			Integer in=(Integer)ob;
			in++;
		}*/
		//mejora en Java 17 - coincidencia de patrones
		Object ob="300";
		if(ob instanceof String s) {
			System.out.println(s);
		}else if(ob instanceof Integer in) {
			in++;
		}
		

	}

}
