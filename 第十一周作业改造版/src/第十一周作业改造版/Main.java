package 第十一周作业改造版;

import user.*;
import production.*;
import utility.*;
public class Main {

	public static void main(String[] args) {
		User us;
		Produce pr;
		pr=(Produce)XMLUtility.getBean();
		us=pr.produceUser();
		us.generateCommucationRecord();
		((Object) us).printDetails();
	}

}
