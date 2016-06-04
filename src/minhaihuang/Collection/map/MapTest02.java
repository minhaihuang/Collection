package minhaihuang.Collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试遍历Map容器对象的各种方式
 * @author 黄帅哥
 *
 */
public class MapTest02 {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put("hhm", "003");
		map.put("hzy", "002");
		map.put("h y", "001");
		map.put("hhc", "004");
		
		//method01(map);
		//method02(map);
		method03(map);
	}
	//第一种方式，获取所有键,返回一个Set容器，然后根据键获取值
	public static void method01(Map map){
		
		//获得所有键的一个集合
		Set set=map.keySet();
		
		//迭代所有的键
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+"="+value);
		}
	}
	
	//第二种方式，获得map容器的所有值,返回一个Collection容器，但是我们不能知道其与键的对应关系
	public static void method02(Map map){
		//获得所有值的集合
		Collection con=map.values();
		
		//遍历值得集合
		Iterator it=con.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//第三种方式，一次性获得所有的键值对对象，返回的是一个Set集合。若使用泛型，则会出现泛型的嵌套
	public static void method03(Map map){
		//获得所有的键值对组成的对象，例如，e是由<Key,value>组成的，那么获得e.
		
		Set set=map.entrySet();
		
		//遍历值得集合
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry e=(Map.Entry) it.next();//Entry为Map内部声明的存储元素的类型类,需要指明为哪个Entry
			System.out.println(e.getKey()+"="+e.getValue());
		}
	}
}
