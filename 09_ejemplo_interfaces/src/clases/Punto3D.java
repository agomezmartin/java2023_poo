package clases;

import interfaces.Operaciones;

public class Punto3D extends Punto implements Operaciones{
	private int z;
	public Punto3D(int z) {
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public void dibujar() {
		super.dibujar();//llama a dibujar() de Punto
		System.out.print(","+getZ());
	}
	@Override
	public void girar(int grados) {
		setX(getX()+grados);
		
	}
	@Override
	public int invertir() {
		z-=10;
		return z;
	}
	
}
