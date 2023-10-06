package model;

import java.time.LocalDateTime;

public class Movimiento {
	private double cantidad;
	private LocalDateTime fechaMovimiento;
	private String tipo;
	public Movimiento(double cantidad, LocalDateTime fechaMovimiento, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
