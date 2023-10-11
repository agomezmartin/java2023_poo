package geometria;

public class DatosFiguras {

	public static void main(String[] args) {
		//crear un objeto cualquiera de cada subclase de figura
		//y a continuación mostrar su color y superfice
		Triangulo tr=new Triangulo("amarillo",6,9);
		System.out.println("Color de la figura: "+tr.getColor());
		System.out.println("Superficie de la figura: "+tr.superficie());
		Circulo cr=new Circulo("azul", 7);
		System.out.println("Color de la figura: "+cr.getColor());
		System.out.println("Superficie de la figura: "+cr.superficie());

	}
	
	
	

}
