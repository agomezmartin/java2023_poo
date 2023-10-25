package principal;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Pedido;
import serializacion.DeserializadorFecha;

public class TestJson {

	public static void main(String[] args) {
		//leer los datos del pedido que se encuentra
		//en el archivo .json, y mostrarlos
		String ruta="c:\\temp\\pedidos.json";
		//Gson gson=new Gson();
		//utilizando el Patrón Builder
		Gson gson=new GsonBuilder()//GsonBuilder
				.registerTypeAdapter(LocalDate.class, new DeserializadorFecha()) //GsonBuilder
				.create();//Gson
		try(FileReader reader=new FileReader(ruta);){
			Pedido[] pedidos=gson.fromJson(reader, Pedido[].class);
			for(Pedido pedido:pedidos) {
				System.out.println("Producto: "+pedido.getProducto());
				System.out.println("Fecha: "+pedido.getFechaPedido());
				System.out.println("Precio: "+pedido.getPrecio());
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
