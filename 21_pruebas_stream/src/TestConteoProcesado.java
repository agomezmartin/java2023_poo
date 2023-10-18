import java.util.List;

public class TestConteoProcesado {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		
		/*System.out.println(nums.stream().count());
		nums.stream()
		.forEach(n->System.out.println(n));*/
		//mostrar los números de la lista, sin duplicados
		nums.stream()
		.distinct() //Stream
		.forEach(n->System.out.print(n+","));
	}

}
