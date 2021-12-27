package kr.revelope.lomboksample;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("kim", 22);

		System.out.println(person.getName() + " : " + person.getAge());
	}
}
