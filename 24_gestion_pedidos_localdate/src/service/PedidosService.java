package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	ArrayList<Pedido> pedidos=new ArrayList<>();
	
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	public Pedido pedidoMasReciente() {		
		return pedidos.stream()//Stream<Pedido>
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))//Optional<Pedido>
				.orElse(null);				
	}
	
	public List<Pedido> pedidosPrecio(double precioMax) {		
		return pedidos.stream()//Stream<Pedido>
		.filter(p->p.getPrecio()<precioMax)//Stream<Pedido>
		.toList();
	}
	
	public List<Pedido> anteriores(int meses){
		return pedidos.stream()//Stream<Pedido>
				.filter(p->p.getFechaPedido().isBefore(LocalDate.now().minusMonths(meses)))
				.toList();
	}
	
	//devuelve una tabla con una partición de pedidos. Los caros (precio superior a la media)
	//por un lado y los baratos (precio inferior a la media) por otro
	public Map<Boolean,List<Pedido>> pedidosAgrupados(){
		double media=pedidos.stream()
					.collect(Collectors.averagingDouble(p->p.getPrecio()));
		return pedidos.stream()
				.collect(Collectors.partitioningBy(p->p.getPrecio()>media));
	}
	
	
}
