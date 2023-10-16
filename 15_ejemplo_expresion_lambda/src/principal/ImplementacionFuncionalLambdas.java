package principal;

interface Printer{
	void print(String s);
}

//crear implementación de la interfaz en la que el método muestre el parámetro
//por pantalla
public class ImplementacionFuncionalLambdas {

	public static void main(String[] args) {
		Printer printer=s->System.out.println(s);
		printer.print("Implementación con lambdas");

	}

}
