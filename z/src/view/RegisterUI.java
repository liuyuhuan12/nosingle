package view;

import java.util.Scanner;

import biz.StudentBiz;

public class RegisterUI {
	static StudentBiz studentBiz = new StudentBiz();
	public static void show() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String studentNo = scanner.nextLine();
		System.out.println("������������");
		String studentName = scanner.nextLine();
		System.out.println("�������Ա�");
		String studentGender = scanner.nextLine();
		System.out.println("���������䣺");
		int studentAge = Integer.parseInt(scanner.nextLine());		
		System.out.println("������Ժϵ��");
		String studentDepartment = scanner.nextLine();
		System.out.println("���������룺");
		String firstPassword = scanner.nextLine();
		System.out.println("���ٴ��������룺");
		String secondPassword = scanner.nextLine();
		
		
		studentBiz.register(studentNo, 
				studentName, 
				studentGender, 
				studentAge, 
				studentDepartment, 
				firstPassword, 
				secondPassword);
	}
	
}
