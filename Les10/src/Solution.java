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
		
		System.out.println("������� ���������� ��������� �������");
				
		try {
			q = Integer.parseInt(reader.readLine());
		} catch (java.lang.NumberFormatException e) {
			System.out.println("�� ����� �� ��� ������, ������� ����� ");
			q = Integer.parseInt(reader.readLine());
		} catch (java.util.NoSuchElementException e) {
			q = Integer.parseInt(reader.readLine());
		}
		
		System.out.println("������� ������������ ����� ���������� ���������� �������");
		s = Integer.parseInt(reader.readLine());
		
	
		ArrayList<Integer> list = new ArrayList<Integer>(); //���������
	
		for (int i = 0; i < q; i++) {		
			list.add(a.nextInt(s));	//��������� ��������� ������� (0-s)		
		}
		
		for (Integer i : list) {
			System.out.println(i);		
		}
	
		info(list);		//���������� � ������ info � ���������� list
		
		list.set(2, 99);		//�������� ������� ������� ������� �� 99
	
		System.out.println("������� ������� ������� " + list.get(0));
	
		for (Integer w : list) {
			System.out.println(w);		
		}	
	
	}
	
	public static void info(ArrayList<Integer> list) {
		System.out.println("����� ��������� ������� " + list.size());
		System.out.println("������������ ������� ������� " + Collections.max(list));
		System.out.println("����������� ������� ������� " + Collections.min(list));
	}
	
}	