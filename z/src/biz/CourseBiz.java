package biz;

import java.util.*;

import dao.*;
import entity.*;

public class CourseBiz {
	private static CourseDao courseDao ;
	private static Course course ;
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	//�鿴���пγ�
	public static void show() {
		courseDao = CourseDao.getInstance();
		courseDao.show();
	}

	//�鿴�γ���ϸ��Ϣ
	public static int show(String s) {
		courseDao = CourseDao.getInstance();
		course = (Course) courseDao.getEntity(s);
		if (course == null) {
			System.out.println("�γ̲�����!");				
			return 0;
		} else {
			
			System.out.println("�γ̱��     �γ�����     ѧ��     ��ʦ      ��ѡ����");
			System.out.println(course.getCourseNo()+"     "+course.getCourseName()
			+"             "+course.getCourseCredit()+"          "+course.getCourseTeacher()
			+"        "+course.getCourseNumber());
			
			return 1;
		}
		
	}
	
}
