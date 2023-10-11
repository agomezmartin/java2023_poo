package geometria;

public class DatosFiguraPolimorfismo {

	public static void main(String[] args) {
		mostrarDatos(new Triangulo("naranja",20,6));
		mostrarDatos(new Circulo("verde",8));
	}
	
	static void mostrarDatos(Figura fr) {
		System.out.println("Color de  "+fr.getClass().getSimpleName()+": "+fr.getColor());
		System.out.println("Superficie de "+fr.getClass().getSimpleName()+": "+fr.superficie());
	}

}
