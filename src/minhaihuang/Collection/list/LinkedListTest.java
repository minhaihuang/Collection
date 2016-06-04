package minhaihuang.Collection.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 测试LinkedList中常用的方法
 *  void addFirst(E e) 
          将指定元素插入此列表的开头。 

 Iterator<E> descendingIterator() 
          返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。 

  E set(int index, E element) 
          将此列表中指定位置的元素替换为指定的元素。 

  int lastIndexOf(Object o) 
          返回此列表中最后出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。 

  E getFirst() 
          返回此列表的第一个元素。 

   E getLast() 
          返回此列表的最后一个元素。 

  ListIterator<E> listIterator(int index) 
          返回此列表中的元素的列表迭代器（按适当顺序），从列表中指定位置开始。 

   E removeFirst() 
          移除并返回此列表的第一个元素。 

   E removeLast() 
          移除并返回此列表的最后一个元素。 

 *
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.add("hhm");
		list.add("h y");
		list.add("hzy");
		list.add("hhc");
		
		//迭代器1
		/*
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}*/
		
		//迭代器2
		/*
		Iterator it2=list.listIterator();
		while(it2.hasNext()){
			Object obj=it2.next();
			System.out.println(obj);
		}*/
		
		//迭代器3，指定开始的索引
		/*Iterator it2=list.listIterator(1);
		while(it2.hasNext()){
			Object obj=it2.next();
			System.out.println(obj);
		}*/
		
		list.addFirst("hhm01");//往第一个位置插入对象
		list.addLast("hhmLast");//往最后位置插入对象
		list.add(1, "hhm02");//往指定的索引插入对象
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
	
}
