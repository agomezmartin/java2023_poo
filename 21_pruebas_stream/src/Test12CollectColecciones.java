import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test12CollectColecciones {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//Crear una lista con todos los números positivos
		//sin incluir repetidos
		List<Integer> positivos=nums.stream()//Stream<Integer>
								.distinct()
								.filter(n->n>0) //Stream<Integer> solo positivos
								//.collect(Collectors.toList());
								.toList();//ojo, solo desde Java 16
		//Crear un conjunto con todos los números positivos
		//sin incluir repetidos						
		Set<Integer> pos=nums.stream()
						.filter(n->n>0)
						.collect(Collectors.toSet());
		
		
		List<String> empleados=List.of("1112F-Angel","98Q-Ana","223R-Esteban");
		//Generar una tabla, donde el código es la clave y el nombre el valor
		Map<String,String> emps=empleados.stream()//Stream<String>
							.collect(Collectors.toMap(s->s.split("-")[0], s->s.split("-")[1]));
		
		
		List<String> empleados2=List.of("ventas-Angel","administración-Ana","ventas-Esteban",
				"ventas-Javier",
				"informática-Laura",
				"administración-Lucas");
				
		Map<String,List<String>> division=empleados2.stream()
				.collect(Collectors.groupingBy(s->s.split("-")[0]));
		//division.forEach((k,v)->System.out.println(k+":"+v));
		division.forEach((k,v)->{
			System.out.print(k+": ");
			v.forEach(n->System.out.println(n.split("-")[1]));
		});
		
		//a partir de la lista de números, generar un map con dos listas, negativos por un lado, positivos por otro
		Map<Boolean,List<Integer>> numeros=nums.stream()
										.collect(Collectors.partitioningBy(n->n>0));
		System.out.println(numeros);
	}

}
