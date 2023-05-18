package reporter;

//제네릭을 선언했지만 모든 타입을 다 받는게 아닌 부모클래스의 유저만 받음

public class CoffeeByUser <T extends  User >{
	
	public T user;
	
	public CoffeeByUser(T user) {
		this.user = user;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + user.name);
		user.addPoint();
	}

}
