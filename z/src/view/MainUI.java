package view;

import java.util.Scanner;

import dao.CourseDao;
import dao.SCDao;
import dao.StudentDao;
import entity.Student;

public class MainUI {
	private static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		MainUI.show();
	}
	
	
	public static void show() throws Exception {
		System.out.println("1 ע��\n2 ��¼\n0 �˳�");
		int option = in.nextInt();
		
		switch (option) {
		case 1:
			RegisterUI.show();
			break;
		case 2:
			LoginUI.show();
			break;
		default:
			System.out.println("��лʹ�ã�");
			StudentDao.getInstance().update();	

			in.close();
			System.exit(0);
		}
	}
	public static void show(Student stu) throws Exception {
		System.out.println("1 �޸�����\n2 ����ѡ��\n0 �˳���¼");
		
		int option = in.nextInt();
		
		switch (option) {
		case 1:
			ModifyPasswordUI.show(stu);
			break;
		case 2:
			CourseSelection.show(stu);
			break;
		default:
			CourseDao.getInstance().update();
			MainUI.show();
		}
		
	}
		
}

