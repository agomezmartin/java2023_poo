import java.util.Arrays;
import java.util.List;

public class Test10FlatMap {

	public static void main(String[] args) {
		//dadas las notas de un centro de formación, donde cada array
		//contiene las notas de un aula
		/*List<Double[]> notas=List.of(new Double[] {2.5,6.7,4.6,9.0},
				new Double[] {7.2,4.4,3.6},
				new Double[] {6.5,3.7,6.6,8.3,5.9},
				new Double[] {8.4,7.2});
		//calcular nota media del centro de formación
		System.out.println(notas.stream() //Stream<Double[]>
			.flatMap(a->Arrays.stream(a))//Stream<Double>
			.mapToDouble(a->a)//DoubleStream
			.average()//OptionalDouble
			.getAsDouble()); //double*/
		List<double[]> notas=List.of(new double[] {2.5,6.7,4.6,9.0},
				new double[] {7.2,4.4,3.6},
				new double[] {6.5,3.7,6.6,8.3,5.9},
				new double[] {8.4,7.2});
		//calcular nota media del centro de formación
		System.out.println(notas.stream() //Stream<Double[]>
			.flatMapToDouble(a->Arrays.stream(a))//DoubleStream
			.average()//OptionalDouble
			.getAsDouble()); //double	

	}

}
