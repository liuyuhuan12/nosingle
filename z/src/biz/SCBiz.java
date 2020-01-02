package biz;

import java.util.Scanner;

import dao.*;
import entity.*;
import view.CourseSelection;

public class SCBiz {
	StudentDao studentDao;
	Student student;
	CourseDao courseDao;
	Course course;
	SCDao scDao;
	SC sc ;

	
	Scanner scanner = new Scanner(System.in);
	
	public SCBiz(){
		studentDao = StudentDao.getInstance();
		
	
		
	}
	public void showI(Student stu) {
		scDao = SCDao.getInstance();
		scDao.show(stu.getStudentName());
		try {
			CourseSelection.show(stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void show(Student stu) {
		
		courseDao = CourseDao.getInstance();
		scDao = SCDao.getInstance();
		
		sc=((SC)scDao.getEntity(stu.getStudentName()));
		System.out.println("������γ̱��:");
		
		CourseBiz.show();
		String cn= scanner.nextLine();
		
		if((course=(Course) courseDao.getEntity(cn))==null) {
			
			System.out.println("�γ̲�����!");	
			
		}else if( sc!=null ) {
			if(SCBiz.stage(course)==false) {
				System.out.println("�γ������ﵽ����!ѡ��ʧ��!");	
			}else if( sc.getCourseName().contains(course.getCourseName())) {
							
					System.out.println("�γ��ظ�ѡ��!ѡ��ʧ��!");	
			}else {
				System.out.println("����ѡ��...");
				course.select();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.setStudentName(stu.getStudentName());
				sc.setStudentNo(stu.getStudentNo());
				
				sc.setCourseName(sc.getCourseName()+course.getCourseName());
				
				scDao.insert(sc);
				
				System.out.println("ѡ�γɹ�!");
			}
		}else {
				System.out.println("����ѡ��...");
				course.select();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc = new SC();
				sc.setStudentName(stu.getStudentName());
				sc.setStudentNo(stu.getStudentNo());
				
				sc.setCourseName(course.getCourseName());
				
				scDao.insert(sc);
				
				System.out.println("ѡ�γɹ�!");
		}
			
			try {
				CourseSelection.show(stu);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	//�γ�����״̬
	private static boolean stage(Course c) {
			boolean state = true;
			if(c.getCourseNumber()<=0) {
				state = false;
			}
			return state;
	}
	//�ظ�ѡ��״̬
//	public static boolean repeat(Student stu ,Course cou,SCDao scDao) {
//		SC sce;
//		sce =  (SC) scDao.getEntity(stu.getStudentName());
//		System.out.print(sce.getCourseName()+"rz");
//		return (sce.getCourseName()).contains(cou.getCourseName());
//	}
}
