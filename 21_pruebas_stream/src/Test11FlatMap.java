import java.util.Arrays;
import java.util.List;

public class Test11FlatMap {

	public static void main(String[] args) {
		String[][] pedidos= {{"azucar","agua","vino","azucar"},
				{"cerveza","pollo","jamóm","vino"},
				{"agua","aceite","pan","jamón","lechuga"}};
		
		//¿Cuanto productos se han pedido entre todas las tiendas?
		System.out.println(Arrays.stream(pedidos)//Stream<String[]>
			.flatMap(a->Arrays.stream(a))//Stream<String>
			.distinct()
			.count());
		
		/*List<List<List<Integer>>> nums;
		nums.stream() //Stream<List<List>>
		.flatMap(l->l.stream())//Stream<List>
		.flatMap(l->l.stream());//Stream<Integer>*/
		
		
	}

}
