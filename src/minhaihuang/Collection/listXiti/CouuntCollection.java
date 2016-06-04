package minhaihuang.Collection.listXiti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 要求：把容器中所有的字符串连接成一个大字符串，如果是数值类型的就相加，如果是Person类型的就统计人数，
 * 并且计算所有的年龄和,如果是其他类型的就直接输出到控制台
 * @author 黄帅哥
 *
 */
public class CouuntCollection {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("hhm");
		list.add(1);
		list.add(1.5);
		list.add(1.50);
		list.add(new Person("hhm",21));
		list.add(new Person("hhc",21));
		list.add(new Person("hzy",23));
		list.add(" love");
		list.add(" lyx");
		list.add(90L);
		
		//建议使用StringBuilder，否则若容器中字符串很多时，将会产生大量的中间变量，效率不高
		//String str=new String();
		StringBuilder str=new StringBuilder();
		
		double sum=0;
		int count=0;
		int sumAge=0;
		
		//遍历容器
		for(int i=0;i<list.size();i++){
			
			//如果是字符串类型的，连接字符串
			if(list.get(i) instanceof String){
				str.append(list.get(i));
			
			}else if(list.get(i) instanceof Number){
		
				String str1=list.get(i).toString();
				double d=Double.parseDouble(str1);
				sum+=d;
				
			}else if(list.get(i) instanceof Person){//如果是Person类型的，统计人数，统计年龄
	
				count++;
				sumAge+=((Person)list.get(i)).getAge();
			}else{
			//如果是其他类型的，直接输出
			System.out.println(list.get(i));
			}
		}
		
		System.out.println("容器组成的字符串为："+str);
		System.out.println("容器数值相加为："+sum);
		System.out.println("容器中的人数为："+count+";"+"年龄总和为："+sumAge);
		
	}
}

//创建一个Person类
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
	
}
