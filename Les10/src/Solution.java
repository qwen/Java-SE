import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;




public class Solution{
	
	public static void main(String[] args){
		
		
		Random a = new Random(); 
	
		ArrayList<Integer> list = new ArrayList<Integer>(); //Коллекция
	
		for (int i = 0; i < 5; i++) {
		
			list.add(a.nextInt(10));	//Заполняем случйными числами (0-10)	
		
		}
	
	
		for (Integer w : list) {
			System.out.println(w);		
		}
	
		System.out.println("Всего элементов массива " + list.size()); 
		System.out.println("Максимальный элемент массива " + Collections.max(list));
		System.out.println("Минимальный элемент массива " + Collections.min(list));

		list.set(2, 9);
	
		System.out.println(list.get(1));
	
		for (Integer w : list) {
			System.out.println(w);		
		}
	
	
	}

}	