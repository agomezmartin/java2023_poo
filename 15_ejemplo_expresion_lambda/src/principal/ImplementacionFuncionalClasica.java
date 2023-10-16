package principal;

interface Printer{
	void print(String s);
}
//crear implementación de la interfaz en la que el método muestre el parámetro
//por pantalla
class PrinterPantalla implements Printer{
	@Override
	public void print(String s) {
		System.out.println(s);
		
	}	
}
public class ImplementacionFuncionalClasica {
	public static void main(String[] args) {
		//utilizar implementación para mostrar texto cualquiera
		Printer printer=new PrinterPantalla();
		printer.print("implementacion clásica");
	}
}
