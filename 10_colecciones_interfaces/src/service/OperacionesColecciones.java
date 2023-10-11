package service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OperacionesColecciones {
	public int sumar(Collection<Integer> coleccion) {
		int suma=0;
		for(Integer in:coleccion) {
			suma+=in;
		}
		return suma;
	}
	
	//realizar un segundo método, que reciba dos colecciones de números
	//y devuelva un conjunto con los números contenidos en ambas
	//colecciones
	public Set<Integer> subconjunto(Collection<Integer> col1, Collection<Integer> col2){
		Set<Integer> resultado=new HashSet<>();
		for(Integer data:col1) {
			if(col2.contains(data)) {
				resultado.add(data);
			}
		}
		return resultado;
	}
}
