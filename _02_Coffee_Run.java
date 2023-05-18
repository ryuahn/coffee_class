package reporter;

public class _02_Coffee_Run {

	public static void main(String[] args) {

//		CoffeeByUser c7 = new CoffeeByUser();
		CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
		c7.ready();
		
//		User클래스를 상속하는 클래스만 들어올 수 있음
		CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
		c8.ready();
	}

}
