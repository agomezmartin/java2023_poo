package pruebas;

public class Operaciones {
	/*constructor por defecto. Lo crea Java
	 * si la clase no tiene constructores explícitos
	 */
	/*public Operaciones() {
		
	}*/
	
	
	public int sum(String s, int ... numeros ) {
		int suma=0;
		for(int num:numeros) {
			suma+=num;
		}
		return suma;
		
	}
	//si se llama con un int, el orden de preferencia
	//es este:
	public int multi(int s) {
		return 10;
	}
	public int multi(long k) {
		return 100;
	}
	public int multi(Integer n) {
		return 40;
	}
	public int multi(int...datos) {
		return 30;
	}
	
	//sobrecarga NO válida
	public int div(int ... nums) {
		return 200;
	}
	public int div(int[] valores) {
		return 300;
	}
	//////////
	
	
	
	
	
}
