package meili;

public class Daima5 {

		public static void main(String[] args){
		          MyThread2 myThread2=new MyThread2();
		          myThread2.start();
		     while(true){
		       System.out.println("main()����������");
		         }
		        }
		      }
		  class MyThread2 extends Thread{
		            public void run(){
		               while(true){
		         System.out.println("MyThread2���run()����������");
		               }
		               }
		  }



