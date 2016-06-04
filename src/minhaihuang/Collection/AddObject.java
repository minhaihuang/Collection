package minhaihuang.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 在容器中，存储的是对象的地址，而不是对象内容的本身。
 * @author 黄帅哥
 *
 */
public class AddObject {

	public static void main(String[] args) {
		
		Collection con=new ArrayList();
		
		Person p=new Person("hhm",21);
		
		con.add(p);
		System.out.println(con);
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
	
		return this.name+this.age;
	}
}
