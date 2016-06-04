package minhaihuang.Collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet的父类是HashSet,
 * 它里面的元素的特点是：有序，不可重复
 * @author 黄帅哥
 *
 */
public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet list=new LinkedHashSet();
		
		list.add("hhm");
		list.add("hhc");
		list.add("hzy");
		list.add("h y");
		list.add("hhm");
		list.add("hhm");
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			String str=(String) it.next();
			System.out.println(str);
		}
	}
}
