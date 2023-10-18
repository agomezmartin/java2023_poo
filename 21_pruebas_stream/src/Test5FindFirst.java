import java.util.List;

public class Test5FindFirst {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,1,10,-8,2,11,27,-5,4,41,10);
		//¿cuál es el primer número negativo de la lista?
		System.out.println(nums.stream()
			.filter(n->n<0) //Stream con los negativos
			.findFirst().orElse(null));

		String nombres="leche,atún,vino,patatas,leche,agua,vino,lechuga";
		//nombre del primer producto que comience por "a", si no hay ninguno
		//que muestre "no hay ninguno"
		
	}

}
