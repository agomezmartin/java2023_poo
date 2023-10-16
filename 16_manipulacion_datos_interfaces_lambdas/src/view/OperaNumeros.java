package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import service.ManipulacionesService;

public class OperaNumeros {
	public static void main(String[] args) {
		List<Integer> numeros=List.of(-5,7,11,4,2,-1,10,8);
		//Utilizando ManipulacionesService:
		//mostrar la suma de los pares por una lado, y la suma de los negativos por otro
		ManipulacionesService service=new ManipulacionesService();		
		System.out.println("Suma pares: "+service.sumaCriterio(numeros, x->x%2==0));
		System.out.println("Suma negativos: "+service.sumaCriterio(numeros, x->x<0));		
		//guardar un fichero (de direccion cualquiera) los negativos
		service.procesaColeccionPorCriterio(numeros, x->x<0, t->{
			try(FileOutputStream fos=new FileOutputStream("c:\\temp\\numeros.txt");
					PrintStream out=new PrintStream(fos)){
				out.println(t);
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		});		
		List<String> nombres=List.of("pan","cadenalarga","vino","bicicleta");
		List<String> res=service.obtenerCadenasCriterio(nombres, x->x.length()>5);
		System.out.println(res);
	}

}
