package minhaihuang.Collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 测试Comparator接口排序，定义一个排序类，使set容器中的Person元素按照年龄的大小排序，若年龄相同，按照姓名排序
 * @author 黄帅哥
 *
 */
public class ComparatorTest02 {

	public static void main(String[] args) {
		myComparator comparator=new myComparator();
		//用此种构造方法
		TreeSet set=new TreeSet(comparator);
		
		set.add(new Person("hhm",20));
		set.add(new Person("hhc",20));
		set.add(new Person("h y",21));
		set.add(new Person("hzy",20));
		
		Iterator it=set.iterator();
		while(it.hasNext()){
			Person p=(Person) it.next();
			System.out.println(p.name+" "+p.age);
		}
	}
}

//自己定义实现Comparator接口，实现compare方法，使其对Person的年龄进行排序,若年龄相等，按照姓名排序
class myComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		
		int age1=p1.getAge();
		int age2=p2.getAge();
		
		if(age1-age2==0){
			
			return p1.name.compareTo(p2.name);
		}else{
			return age1-age2;
		}
	}
}
