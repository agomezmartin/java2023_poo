package principal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForeach {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(7,12,9,3,6,4);
		for(Integer n:numeros) {
			System.out.println(n);
		}
		
		numeros.forEach(n->System.out.println(n));
		
		///////////////////
		Map<Integer, String> dias=new HashMap<>();
		dias.put(125, "lunes");
		dias.put(300, "martes");
		dias.put(400, "miércoles");
		dias.put(200, "jueves");
		dias.forEach((k,v)->System.out.println(k+":"+v));
	}

}
