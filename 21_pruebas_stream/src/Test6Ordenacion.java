import java.util.List;

public class Test6Ordenacion {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,1,10,-8,2,11,27,-5,4,41,10);
		//¿cual es el número más pequeño?
		System.out.println(nums.stream()
			.sorted() //Stream
			.findFirst()
			.get());
		
		//Mostrar los cinco números más altos (sin repetición)
		nums.stream()
		.distinct()
		.sorted((a,b)->b-a)
		.limit(5)
		.forEach(n->System.out.println(n));
		
		//mostrar los que van desde la posicion 5 a la 10
		int pos1=5;
		int pos2=10;
		nums.stream()
		.skip(pos1-1) //Stream
		.limit(pos2-pos1)//Stream
		.forEach(n->System.out.println(n));
		
		
	}

}
