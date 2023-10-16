package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ManipulacionesService {
	//suma los pares de la lista
	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}
	//suma los positivos de la lista
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in>0) {
				suma+=in;
			}
		}
		return suma;
	}*/
	//creamos un método que sirva para sumar los números
	//de la colección que cumplan el criterio
	public int sumaCriterio(List<Integer> numeros, Predicate<Integer> criterio) {
		int suma=0;
		for(Integer in:numeros) {
			if(criterio.test(in)) {
				suma+=in;
			}
		}
		return suma;
	}
	
	//método que recibe lista de enteros y los imprime
	//métodos que recibe lista de enteros y los guarda en fichero
	//que recibe lista de enteros y los manda la nube
	public void procesaLista(List<Integer> numeros, Consumer<Integer> consumer) {
		for(Integer n:numeros) {
			consumer.accept(n);
		}
	}
	
	//método que recibe una lista de enteros e imprime los pares
	//método que recibe un conjunto de enteros y guarda en un fichero los positivos
	//método que recibe una lista de enteros y manda a la nube los múltiplos de cinco
	
	public void procesaColeccionPorCriterio(Collection<Integer> numeros,
											Predicate<Integer> criterio,
											Consumer<Integer> proceso) {
		for(Integer n:numeros) {
			if(criterio.test(n)) {
				proceso.accept(n);
			}
		}
	}
	
	//método que recibe coleccion enteros y devuelve la suma de los cuadrados de esos números
	//método que recibe coleccion enteros y devuelve la suma de las raices cúbicas esos números
	public int sumaTransformacion(Collection<Integer> numeros, UnaryOperator<Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);//se acumula el resultado de operar el número
		}
		return suma;
	}
	
	
	//Método que reciba una colección de cadenas de texto y devuelva una
	//lista con aquellas que cumplan con el predicado recibido
	//como parámetro
	public List<String> obtenerCadenasCriterio(Collection<String> cadenas, Predicate<String> criterio){
		List<String> datos=new ArrayList<>();
		for(String s:cadenas) {
			if(criterio.test(s)) {
				datos.add(s);
			}
		}
		return datos;
	}
	
	
	
}
