package principal;

import java.util.function.BiPredicate;

public class TestLambdas {

	public static void main(String[] args) {
		//Mediante expresión lambda, crear una implementación
		//de BiPredicate<Integer,Integer>, que devuelva true
		//solo cuando los números sean iguales

		BiPredicate<Integer,Integer> impl1=(a,b)->a==b;

		//Otra implementación que devuelva true solo si ambos números
		//son positivos

		BiPredicate<Integer,Integer> impl2=(a,b)->a>0&&b>0;

		//partiendo de las implementaciones anteriores, crear una
		//implementación que devuelva true si ambos números son
		//positivos e iguales

		BiPredicate<Integer,Integer> impl3=impl1.and(impl2);     //(a,b)->(a>0&&b>0)&&a==b;
		//pruebas
		System.out.println(impl3.test(2, 3));
		System.out.println(impl3.test(5, 5));
	}

}
