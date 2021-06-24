package jp.co.afoce.study;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog();
		Cat cat = new Cat();
		//dog.name = "ぽち";
		//age = 3;
		
		dog.setAge(3);
		dog.setName("ぽち");
		dog.showProfile();
		
		cat.setAge(4);
		cat.setName("たま");
		cat.showProfile();
	}

}
