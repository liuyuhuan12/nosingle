package biz;

import java.util.Scanner;

import dao.StudentDao;
import entity.Student;
import view.MainUI;
import view.ModifyPasswordUI;

public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	Scanner scanner = new Scanner(System.in);

	//��¼
	public void login(String studentNo, String studentPassword) throws Exception {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("�û�������");
			MainUI.show();
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("��¼�ɹ�");
			MainUI.show(student);
		} else {
			System.out.println(student.getStudentPassword()+"!���벻��ȷ!"+studentPassword);
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) throws Exception {
		try {
			
		
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentGender(studentGender);
			student.setStudentPassword(firstPassword);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			System.out.println("ע��ɹ���");
			MainUI.show();
		}else {
			System.out.println("�����������벻ͬ����\n�������������룺");
			String fp = scanner.nextLine();
			System.out.println("���ٴ��������룺");
			String sp= scanner.nextLine();
			StudentBiz sc = new StudentBiz();
			sc.register(studentNo, 
					studentName, 
					studentGender, 
					studentAge, 
					studentDepartment, 
					fp, 
					sp);	
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//�޸�����
	public void modifyPassword(Student stu) {
		System.out.println("�������޸ĺ����룺");
		String mp1 = scanner.nextLine();
		System.out.println("���ٴ������޸ĺ����룺");
		String mp2 = scanner.nextLine();
		if(mp1.equals(mp2)) {
			studentDao = StudentDao.getInstance();
			stu.setStudentPassword(mp1);
			studentDao.delete(stu);
			studentDao.insert(stu);
			System.out.println("�޸ĳɹ�!");
			
			try {
				MainUI.show(stu);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("�������벻ͬ!");
			ModifyPasswordUI.show(stu);
		}
		} 
	}

