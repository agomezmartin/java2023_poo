package principal;

import java.util.ArrayList;
import java.util.List;

class Datos2{
	//Método que nos devuelva una lista con los 10 primeros números enteros
	public List<Integer> numeros(){
		/*ArrayList<Integer> lst=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			lst.add(i);
		}
		return lst;*/
		//return List.of(1,2,3,4,5,6,7,8,9,10); //inmutables
		Integer [] nums=new Integer[1000];
		for(int i=1;i<=1000;i++) {
			nums[i-1]=i;
		}
		return List.of(nums);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Datos2 dt=new Datos2();
		List<Integer> nums=dt.numeros();
		nums.add(11);
		for(Integer n:nums) {
			System.out.println(n);
		}
		

	}

}
