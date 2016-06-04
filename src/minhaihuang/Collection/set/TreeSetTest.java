package minhaihuang.Collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet容器，理解其原理。
 * 1，无论添加的元素类型如何，其内部都会进行排序，所以输出的数据都是有顺序的
 * 2，根据排序二叉树进行排序
 * 3，遍历时是根据中序遍历
 * 4，若所添加的对象没有实现Compareable接口，最多只能添加一个元素
 * 5，不能忘TreeSet中添加null;
 * @author 黄帅哥
 *
 */
public class TreeSetTest {
	
	public static void main(String[] args) {
		
	Set set=new TreeSet();
//	set.add(1);
//	set.add(2);
//	set.add(4);
//	set.add(5);
//	set.add(3);
//	set.add(6);
//	set.add(7);
	
	set.add(new Person("a",21));
	set.add(new Person("c",21));
	set.add(new Person("b",23));
	set.add(new Person("d",22));
	Iterator it=set.iterator();
	while(it.hasNext()){
		Person p=(Person) it.next();
		System.out.println(p.name);
	}
	}
}

class Person implements Comparable{
	String name;
	int age;
	
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

	//根据名字的字母来排序
	@Override
	public int compareTo(Object o) {
		Person p=(Person) o;
		return name.compareTo(p.getName());
	}
	
	
}
