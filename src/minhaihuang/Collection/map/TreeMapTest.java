package minhaihuang.Collection.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 测试TreeMap的一些基本用法，理解里面的元素的排序规则
 * 注意：里面的元素是有规则的排序的
 * 
 * 自己写一个比较元素的类，让TreeMap里面的元素按照自己所定下的规则排序
 *
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		
		//测试put方法,没什么不同
		map.put("hhm", 19);
		map.put("hhc", 20);
		map.put("h y", 21);
		map.put("hzy", 22);
		map.put("hhm", 20);
		
		//测试get方法,没什么不同
		//System.out.println(map.get("hhm"));//20
		
		//测试remove方法,没什么不同
		//map.remove("hhc");
		//System.out.println(map.get("hhc"));//null
		
		//测试遍历的方法,有三种遍历的方式，也没有什么不同
		//Set<String> set=map.keySet();
		
		//测试自己定义的排序方法是否成功
		//1，首先创建一个自己的比较器的对象
		MyComparator myCom=new MyComparator(map);
		//定义另外一个TreeMap的对象map2，传入自己的比较器，注意构造方法的不同。
		TreeMap<String,Integer> map2=new TreeMap<String,Integer>(myCom);
		map2.putAll(map);
		
		//遍历map2，看里面的元素是否按照自己定义的规则排序
		Set<String> set=map2.keySet();
		
		Iterator<String> it=set.iterator();
		String s=null;
		while(it.hasNext()){
			s=it.next();
			System.out.println(s+"="+map2.get(s));
		}
		
	}
}

//自己定义一个排序的类（比较器），让元素根据自己定义的排序规则添加到TreeMap里面
//现在是定义按照年龄排序，若年龄相同，按照姓名排序
class MyComparator implements Comparator{

	 private Map<String,Integer> map;
	//要提供一个Map来获取value
	 MyComparator(Map<String,Integer> map){
		this.map=map;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer age1=map.get(o1);
		Integer age2=map.get(o2);
		
		if(age1==null||age2==null){
			return 1;
		}
		
		if(age1.equals(age2)){
			return o1.toString().compareTo(o2.toString());
		}
		return age1.compareTo(age2);
	}
	
}
