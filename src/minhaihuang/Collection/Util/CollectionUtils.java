package minhaihuang.Collection.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtils {

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
