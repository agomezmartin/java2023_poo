import java.util.List;

public class Test7MaxMin {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,1,10,-8,2,11,27,-5,4,41,10);
		//mostrar el negativo más alto
		System.out.println(
				nums.stream()
				.filter(n->n<0) //Stream solo negativos
				.max((a,b)->a-b)//Optional con el resultado
				.orElse(null)
				);

	}

}
