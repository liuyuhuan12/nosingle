package 第十一周作业改造版;

import user.*;
public class TelcomUserProduce extends Produce{
	public User produceUser(){
		return new TelcomUser("17395832855");
	}
}