package view;

import java.util.Scanner;

import biz.StudentBiz;

public class LoginUI {	

	public static void show() throws Exception {
		Scanner scanner;
		String Name;
		String Password;
		StudentBiz studentBiz = new StudentBiz();
		System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		Name = scanner.nextLine();
		System.out.println("���������룺");
		Password = scanner.nextLine();
		
		studentBiz.login(Name, Password);
	}
}
