package minhaihuang.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 测试ListIterator常用的方法
 *
 */
public class ListIteratorTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		for(int i=0;i<10;i++){
			list.add(i);
		}
		
		ListIterator it=list.listIterator();
		
		//将光标下移两个位置
		it.next();
		it.next();
		
		//
		int index=it.nextIndex();
		System.out.println(index);
		
		System.out.println(it.hasPrevious());
		Object e=it.previous();
		System.out.println(e);
	}
}
