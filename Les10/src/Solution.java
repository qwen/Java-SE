import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Solution{
		
	public static void main(String[] args) throws Exception {
		
		int q;
		int s;
		Random a = new Random(); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Введите количество элементов массива");
				
		try {
			q = Integer.parseInt(reader.readLine());
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Вы ввели не тот символ, введите число ");
			q = Integer.parseInt(reader.readLine());
		} catch (java.util.NoSuchElementException e) {
			q = Integer.parseInt(reader.readLine());
		}
		
		System.out.println("Введите максимальное число рандомного заполнения массива");
		s = Integer.parseInt(reader.readLine());
		
	
		ArrayList<Integer> list = new ArrayList<Integer>(); //Коллекция
	
		for (int i = 0; i < q; i++) {		
			list.add(a.nextInt(s));	//Заполняем случйными числами (0-s)		
		}
		
		for (Integer i : list) {
			System.out.println(i);		
		}
	
		info(list);		//Обращаемся к методу info с параметром list
		
		list.set(2, 99);		//Заменяем второый элемент массива на 99
	
		System.out.println("Нулевой элемент массива " + list.get(0));
	
		for (Integer w : list) {
			System.out.println(w);		
		}	
	
	}
	
	public static void info(ArrayList<Integer> list) {
		System.out.println("Всего элементов массива " + list.size());
		System.out.println("Максимальный элемент массива " + Collections.max(list));
		System.out.println("Минимальный элемент массива " + Collections.min(list));
	}
	
}	