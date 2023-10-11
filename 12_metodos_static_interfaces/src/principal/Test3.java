package principal;

interface Printer{
	void print(String cad);
	
	static Printer of() {
		//creamos un objeto que implementa la interfaz, 
		//mediante una clase anónima
		return new Printer() {
			
			@Override
			public void print(String cad) {
				System.out.println(cad);
				
			}
		};
	}
}


public class Test3 {

	public static void main(String[] args) {
		Printer pr=Printer.of();
		pr.print("hello");
	}

}
