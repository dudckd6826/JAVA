package lab.itank.packageclass;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("å�̸� �Է�>>");
		String name = scanner.nextLine();
		System.out.println("�Է°� Ȯ�� : " + name);
		
		System.out.println("å���� �Է� >>");
//		int price = scanner.nextInt();
		int price = Integer.parseInt(scanner.nextLine());
		System.out.println("�Է°� Ȯ�� : " + price);
		
//		scanner.nextLine();
		
		System.out.println("���� �Է�>>");
		String writer = scanner.nextLine();
		System.out.println("�Է°� Ȯ�� : " + writer);
		
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("å ���� : "+name+", ���� : "+price+", ���� : "+writer);
		
		Book book = new Book(name, price, writer);
		
		//��ĳ�� �ݱ�
		scanner.close();
	}

}