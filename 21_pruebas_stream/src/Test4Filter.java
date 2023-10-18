import java.util.Arrays;
import java.util.List;

public class Test4Filter {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//¿cuantos números pares hay?
		System.out.println(nums.stream()
			.distinct() //Stream
			.filter(n->n%2==0) //Stream
			.count());
		String nombres="leche,atún,vino,patatas,leche,agua,vino,lechuga";
		//¿cuantos productos de menos de 6 caracteres hay?
		System.out.println(Arrays.stream(nombres.split(",")) //Stream
			.distinct() //Stream
			.filter(s->s.length()<6)//Stream
			.count());

	}

}
