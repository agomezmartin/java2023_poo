package clases;

import interfaces.Operaciones;

public class Mesa implements Operaciones{
	private int largo, alto, ancho;

	public Mesa(int largo, int alto, int ancho) {
		super();
		this.largo = largo;
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public void girar(int grados) {
		largo+=grados;
		ancho+=grados;
		
	}

	@Override
	public int invertir() {
		alto*=-1;
		return alto;
	}
	
}
