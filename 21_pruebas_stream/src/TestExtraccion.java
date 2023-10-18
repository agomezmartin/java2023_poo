import java.util.List;

public class TestExtraccion {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//Muestra los 7 primeros números no repetidos
		nums.stream()
		.distinct() //Stream
		.limit(7) //Stream
		.forEach(n->System.out.print(n+","));
		
		//¿hay algún negativo?
		System.out.println(
				nums.stream()
				.anyMatch(x->x<0)
				);
		
		//¿son todos pares?
		System.out.println(
				nums.stream()
				.allMatch(x->x%2==0)
				);

	}

}
