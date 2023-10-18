package view;

import service.ProductosService;

public class TestProductos {

	public static void main(String[] args) {
		var prService=new ProductosService();
		//creamos seis productos de prueba en tres categorias
		//bajar 5% a todos
		//subir 10% a una categoria
		//eliminar otra categoria
		//ordenar 
		//mostrar todos
		prService.altaProducto("p1", 10, "cat1");
		prService.altaProducto("p2", 20, "cat1");
		prService.altaProducto("p3", 30, "cat2");
		prService.altaProducto("p4", 40, "cat2");
		prService.altaProducto("p5", 50, "cat3");
		prService.altaProducto("p6", 60, "cat3");
		prService.bajarPrecio(5);
		prService.subirPrecioCategoria(10, "cat1");
		prService.eliminarPorCategoria("cat2");
		prService.ordenarPorPrecio();
		prService.obtenerProductos().forEach(p->
		 System.out.println(p.getNombre()+":"+p.getPrecio()+":"+p.getCategoria()));

	}

}
