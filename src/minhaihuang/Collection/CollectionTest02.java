package minhaihuang.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试Collection接口中其他常用的方法。
 *  void clear()，清空此容器 . 
 *  boolean isEmpty()，判断容器是否为空.
 */
public class CollectionTest02 {

	public static void main(String[] args) {
		Collection con = new ArrayList();

		Collection con2= new ArrayList();
		
		con.add("123");
		con.add("22534");
		con.add("1345");
		con.add(1234);
//
//		System.out.println(con.size());// 4
//		con.clear();// 清空容器
//		System.out.println(con.isEmpty());// true
//		System.out.println(123);
		
		con2.addAll(con);//加入con的全部元素
		System.out.println(con2.size());
		con2.add("123455555");
		System.out.println(con2.containsAll(con));//判断是否包含con的全部元素
		
		System.out.println(con2.removeAll(con));//在con2中移除那些也属于con的元素
		//System.out.println(con2.retainAll(con));//在con2中只保留属于con2也属于con的元素
		System.out.println(con2);
		
	}
}
