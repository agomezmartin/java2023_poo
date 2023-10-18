import java.util.List;

public class Test9Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,1,10,-8,2,11,27,-5,4,41,10);
		//mostrar todos los número positivos y la suma de los mismos
		
		System.out.println("Suma: "+nums.stream()
		.filter(n->n>0)
		.peek(n->System.out.println(n)) //Stream<Integer>
		.mapToInt(n->n) //InteStream
		.sum());

	}

}
