package meili;

public class Daima3 {


  public static void main(String[] args){
	  new Taxi().start();
	  new Taxi().start();
	  new Taxi().start();
	  new Taxi().start();
	  new Taxi().start();
  }
}
class Taxi extends Thread{
	private int passengers=100;
	public void run(){
		while(true){
			if(passengers>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽ��͵�"+passengers--+"���˿�");
			}
		}
	}
}


