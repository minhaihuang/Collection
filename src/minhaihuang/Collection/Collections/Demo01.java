package minhaihuang.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Collections工具类中常用的方法
 * @author 黄帅哥
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		//1，addAll()方法，将指定的元素通通加入到指定的容器当中
		Collections.addAll(list, 1,2,3);
		//2，fill(List<? super T> list, T obj)，用指定元素替换指定列表中的所有元素。
		//Collections.fill(list, "v");
		
		//3,reverse(List<?> list) 反转指定列表中元素的顺序。
		//Collections.reverse(list);
		
		
		//4,void shuffle(list),洗牌，随意打乱容器的元素的位置
		//Collections.shuffle(list);
		//System.out.println(list);
		
		//5，replaceAll(List<T> list, T oldVal, T newVal) 使用另一个值替换列表中出现的所有某一指定值。
//		list.add(1);
//		Collections.replaceAll(list, 1, 4);
//		System.out.println(list);
		
		//6,copy(List<? super T> dest, List<? extends T> src)  将所有元素从一个列表复制到另一个列表。,测试有误，谨慎使用
//		List list2=new ArrayList();
//		Collections.copy(list2, list);
//		System.out.println(list2);
	}
}
