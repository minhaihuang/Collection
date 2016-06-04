package minhaihuang.Collection.setXiti;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *要求： 利用set容器的元素不可重复性去除list容器里面的重复元素
 * 
 * @author 黄帅哥
 *
 */
public class Quchong {

	public static void main(String[] args) {
		List set=new ArrayList();
		set.add("hhm");
		set.add("hhc");
		set.add("hzy");
		set.add("h y");
		set.add("hhm");
		
		//建议使用第一种方法
		//HashSet set02=quChongDetial02(set);
		HashSet set02=quChongDetial01(set);
		Iterator it=set02.iterator();
		while(it.hasNext()){
			String str=(String)it.next();
			System.out.println(str);
		}
	}
	
	/**
	 * 定义去重的方法,第一种方法
	 * @param set
	 */
	public static HashSet quChongDetial01(List list){
		//创建一个新容器，用来存储没有重复的数据
		HashSet set02=new HashSet();
		
		set02.addAll(list);
		
		return set02;
	}
	
	/**
	 * 定义去重的方法,第二种方法
	 * @param list
	 * @return
	 */
	public static HashSet quChongDetial02(List list){
		//创建一个新容器，用来存储没有重复的数据
		HashSet set02=new HashSet();
		Object obj=null;
		
		//遍历list，若在set容器中没有list中元素，添加到set容器，若有，忽略掉
		Iterator it=list.iterator();
		
		while(it.hasNext()){
			obj=it.next();
			if(!set02.contains(obj)){
				set02.add(obj);
			}
			
		}
		
		return set02;
	}
}
