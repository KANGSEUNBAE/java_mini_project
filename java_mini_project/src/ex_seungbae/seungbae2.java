package ex_seungbae;

import java.util.Scanner;

public class seungbae {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String lunch[] = new String[4];
		System.out.println("메뉴입력하세요");
		for (int i = 0; i < lunch.length; i++) {
			lunch[i] = scanner.next();
		}
		System.out.println("메뉴리스트");
		for (int i = 0; i < lunch.length; i++) {
			
			System.out.println(" " + lunch[i]);
			scanner.close();
		}
	}

}
