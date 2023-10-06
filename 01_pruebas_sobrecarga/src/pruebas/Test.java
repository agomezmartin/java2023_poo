package pruebas;

public class Test {

	public static void main(String[] args) {
		Operaciones operaciones =new Operaciones();
		operaciones.sum("s");
		operaciones.sum("a",3);
		operaciones.sum("u",4,8);
		
		System.out.println(operaciones.multi(3));
	}

}
