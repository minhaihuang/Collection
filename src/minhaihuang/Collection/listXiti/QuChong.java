package minhaihuang.Collection.listXiti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 要求：去除一个List中重复的元素
 * @author 黄帅哥
 *
 */
public class QuChong {

	public static void main(String[] args) {
	List list=new ArrayList();
	
	list.add("123");
	list.add("1213");
	list.add("123");
	list.add("hhm");
	list.add("hhm");
	list.add(1);
	list.add(1);
	
	List list2=quChongArrayList(list);
	System.out.println(list2);
	}
	
	/**
	 * List对象去重，返回一个ArrayList对象
	 * @param list
	 * @return
	 */
	public static List quChongArrayList(List list){
		
			ArrayList list2=new ArrayList();
		
		for(int i=0;i<list.size();i++){
			
			if(!list2.contains(list.get(i))){
				
				list2.add(list.get(i));
			}
		}
		
		return list2;
	}
		
	
	/**
	 * List对象去重，返回一个LinkedList对象
	 * @param list
	 * @return
	 */
	public static List quChongLinkedList(List list){
			
			LinkedList list2=new LinkedList();
			
			for(int i=0;i<list.size();i++){
				
				if(!list2.contains(list.get(i))){
					
					list2.add(list.get(i));
				}
			}
			
			return list2;
		}
	
	/**
	 * ArrayList对象去重，返回一个新的Arraylist对象
	 * @param list
	 * @return
	 */
	public static ArrayList quChong(ArrayList list){
		
	ArrayList list2=new ArrayList();
		
		for(int i=0;i<list.size();i++){
			
			if(!list2.contains(list.get(i))){
				
				list2.add(list.get(i));
			}
		}
		
		return list2;
	}

	/**
	 * LinkedList对象去重，返回一个新的LinkedList对象
	 * @param list
	 * @return
	 */
public static LinkedList quChong(LinkedList list){
	
	LinkedList list2=new LinkedList();
	
	for(int i=0;i<list.size();i++){
		
		if(!list2.contains(list.get(i))){
			
			list2.add(list.get(i));
		}
	}
	
	return list2;
}
}
