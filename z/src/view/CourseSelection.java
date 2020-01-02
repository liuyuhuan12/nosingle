package view;

import java.util.Scanner;

import biz.*;
import dao.CourseDao;
import entity.Student;

public class CourseSelection {
	public static void show(Student stu) throws Exception {
		SCBiz sc = new SCBiz();
		while(true) {
			CourseDao.getInstance().update();
			System.out.println("1 �鿴�γ���Ϣ\n2 ѡ��\n3 �鿴��ѡ�γ�\n0 �˳�ѡ��");
			Scanner in = new Scanner(System.in);
			int option = Integer.parseInt(in.nextLine());	
			
			switch (option) {
			case 1:
				
				System.out.println("1 �鿴���пγ�\n2 �鿴��ϸ��Ϣ\n");
				int c = Integer.parseInt(in.nextLine());
				if(c==1) {
					CourseBiz.show();
				}else if(c==2){		
					System.out.println("������γ̱��:");
					String s = in.nextLine();
					CourseBiz.show(s);
				}
				break;
			case 2:
				
				sc.show(stu);
				break;
			case 3:	
				
				sc.showI(stu);
				
			default:
				MainUI.show(stu);
			}
		}
	}
}
