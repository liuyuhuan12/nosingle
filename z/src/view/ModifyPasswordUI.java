package view;

import java.util.Scanner;
import biz.*;
import dao.StudentDao;
import entity.Student;

public class ModifyPasswordUI {
	static StudentBiz studentBiz = new StudentBiz();
	static Scanner in = new Scanner(System.in);
	public static void show(Student stu) {
		System.out.println("������ԭ�����룺");
		
		String mp1 = in.nextLine();
		if (stu.getStudentPassword().equals(mp1)) {
			studentBiz.modifyPassword(stu);
			
		}else {
			System.out.println("���벻��ȷ��");
			//���һ���Ƿ������������������ж����
			ModifyPasswordUI.show(stu);
		}
	}
}
