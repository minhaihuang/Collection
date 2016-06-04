package minhaihuang.Collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 测试Comparator比较器
 * @author 黄帅哥
 *
 */
public class ComparatorTest {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		
		
		//若直接调用工具来对list进行排序，默认是得到升序排列
		//Collections.sort(list);
		
		//自己定义排列的方法，按照降序排列
		Collections.sort(list, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Integer i1=(Integer)o1;
				Integer i2=(Integer)o2;
				
				return i2-i1;
			}});
		println(list);
	}

	
	
	
	public static void println(List list){
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}
}

	
