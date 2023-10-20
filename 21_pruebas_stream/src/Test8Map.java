import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test8Map {

	public static void main(String[] args) {
		String nombres="leche atún,vino,patatas,mantequilla-ajo,arroz,lechuga";
		//Mostrar las longitudes de cada texto, de menor a mayor
		
		Arrays.stream(nombres.split("[, -]")) //Stream<string>
		.map(s->s.length())//Stream<Integer>
		.sorted()
		.forEach(n->System.out.println(n));
		
		//mostrar el total de caracteres de todos los productos, sin contar repetidos
		System.out.println(Arrays.stream(nombres.split("[, -]")) //Stream<string>
			.distinct() //Stream<string>
			/*.mapToInt(s->s.length()) //IntStream
			.sum());*/
			.collect(Collectors.summingInt(s->s.length())));
		
		List<Integer> nums=List.of(6,11,-4,8,1,10,-8,2,11,27,-5,4,41,10);
		//media de positivos
		System.out.println(
				nums.stream()
				.filter(n->n>0) //Stream<Integer>
				/*.mapToInt(n->n)//IntStream
				.average()
				.orElse(0)				
				);*/
				.collect(Collectors.averagingDouble(n->n)));
		
	}

}
