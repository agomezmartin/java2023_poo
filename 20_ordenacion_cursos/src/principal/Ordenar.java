package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.Curso;

public class Ordenar {

	public static void main(String[] args) {
		List<Curso> cursos=new ArrayList<>(List.of(
					new Curso("Java básico",100,LocalDate.of(2023, 11, 20),350),
					new Curso("Spring",60,LocalDate.of(2023, 10, 11),230),
					new Curso("Angular",40,LocalDate.of(2023, 10, 11),125),
					new Curso("Hibernate",30,LocalDate.of(2023, 10, 10),80),
					new Curso("Python",90,LocalDate.of(2023, 11, 20),160)
				));

		//ordenar la lista de cursos por fecha de inicio. En caso de comenzar en la misma fecha
		//se ordena por duración
		//después se muestran todos
		Comparator<Curso> cmp1=(a,b)->a.getFechaInicio().compareTo(b.getFechaInicio());
		Comparator<Curso> cmp2=(a,b)->Integer.compare(a.getDuracion(), b.getDuracion());
		Comparator<Curso> cmpMix=cmp1.thenComparing(cmp2);
		cursos.sort(cmpMix);//aplica la unión de los dos
		
		cursos.forEach(c->System.out.println(c.getDenominacion()+":"+c.getDuracion()+":"+c.getFechaInicio()));
		
		
		
		
		

	}

}
