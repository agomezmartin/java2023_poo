package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	//recibe los datos de la ciudad y la agrega,no puede haber dos ciudades
	//con mismo nombre y pais. Devuelve boolean informando si añade o no
	public boolean nuevaCiudad(String nombre, String pais, long habitantes, double temperaturaMedia) {
		if(ciudades.stream().noneMatch(c->c.getNombre().equals(nombre)&&c.getPais().equals(pais))) {
			ciudades.add(new Ciudad(nombre,pais,habitantes,temperaturaMedia));
			return true;
		}
		return false;
	}
	
	//a partir de un pais, devuelve el total de ciudades registradas de ese pais
	public int totalCiudadesPais(String pais) {
		return (int)ciudades.stream()
				.filter(c->c.getPais().equals(pais))
				.count();
	}

	//devuelve el total de paises registrados
	public int totalPaises() {
		return (int)ciudades.stream() //Stream<Ciudad>
				.map(c->c.getPais()) //Stream<String>
				.distinct()
				.count();
	}
	
	//a partir de una temperatura, indica si hay alguna ciudad
	//con temperatura media inferior a ese valor
	public boolean existeCiudadTempInf(double temp) {
		return ciudades.stream()
				.anyMatch(c->c.getTemperaturaMedia()<temp);
	}
	
	//método que devuelva los datos de la ciudad cuyo nombre se recibe como parámetro
	
	public Ciudad ciudadPorNombre(String nombre) {
		return ciudades.stream()
				.filter(c->c.getNombre().equals(nombre))//Stream
				.findFirst() //Optional<Ciudad>
				.orElse(null);//devuelve la Ciudad y si no existe, null
	}
	
	//Datos de la ciudad más poblada
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
				.max((a,b)->Long.compare(a.getHabitantes(), b.getHabitantes()))//Optional<Ciudad>
				.orElse(new Ciudad());
	}
	
	
	//dado un pais, media de habitantes de sus ciudades
	public double mediaHabitantesPorPais(String pais) {
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais))//Stream<Ciudad>
				.mapToLong(c->c.getHabitantes()) //LongStream
				.average()
				.orElse(0);
	}
	
	//temperatura media más alta de entre todas las ciudades
	public double temperaturaMasAlta() {
		return ciudades.stream()
				.mapToDouble(c->c.getTemperaturaMedia())
				.max()
				.orElse(0);
	}
	
	//A partir de un pais devuelve la lista de ciudades de dicho pais
	public List<Ciudad> ciudadesPais(String pais){
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Ciudad>
				.collect(Collectors.toList());
	}
	//devuelve una lista con los nombres de los paises
	public List<String> nombresPaises(){
		return ciudades.stream() //Stream<Ciudad>
				.map(c->c.getPais()) //Stream<String>
				.distinct()
				.collect(Collectors.toList());
				
	}
	
}
