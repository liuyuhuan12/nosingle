package 代码重构第三版;

public class Main {
		public static void main(String[] args) {
			Customer person1=new Customer("LiuYuhuan");
			Movie movie1=new Movie("Zhanlang2",1235);
			Rental rental1=new Rental(movie1,19999999);
			person1.addRental(rental1);
			System. out.print(person1. statement());
		}
} 