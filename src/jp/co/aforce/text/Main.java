package jp.co.aforce.text;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car;
		car = new Car();
		
		car.speedUp(40);
		car.speedDown(10);
		
		//car.speed = 80;
		//System.out.println("スピード:" + car.speed);
		
		
		
		//car.speedUp(10);
		//int newSpeed = 80;
		
		//car.speedUp(newSpeed);
		System.out.println("速度:" + car.getSpeed());
		//System.out.println("スピード:" + car.speed);
		
		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);
		
	}

}
