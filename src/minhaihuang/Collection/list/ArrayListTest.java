package minhaihuang.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 测试ArrayList中的一些常用方法
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();//初始化时给定一个容器大小为10的容器，但是如果添加大于10个元素也不会报错，因为
									  //add方法内部做了对索引进行判断的处理
		
		arr.add("123");//add()方法
		arr.add(1, "hhm");//往指定位置加入对象
		arr.add("lyx");
		
		for(int i=0;i<20;i++){
			arr.add(i);
		}
		
		System.out.println(arr.size());
		System.out.println(arr.get(2));//获得指定位置的元素，索引从0开始
		arr.remove(0);//删除指定索引的元素
		
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		
		Iterator it=arr.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
}
