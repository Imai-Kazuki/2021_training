package jp.co.afoce.study;

public class Animal {
	private String name;
	private int age;
	void showProfile() {
		System.out.println("名前は" + this.name + "年齢は" + this.age + "歳です");
	}
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
}
