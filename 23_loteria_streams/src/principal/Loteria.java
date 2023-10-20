package principal;

import java.io.IOException;
import java.util.stream.Stream;

public class Loteria {

	public static void main(String[] args) {
		Stream.generate(()->(int)(Math.random()*49+1))//Stream<Integer>
		.distinct()
		.limit(6)
		.sorted()
		.forEach(n->System.out.print(n+","));
		System.out.println("Pulse tecla para continuar....");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
