package minhaihuang.Collection.map;

import java.util.LinkedList;

/**
 * 对MyMap001进行升级，增加插入与查询的效率
 * 思路：1，每一个对象都会有其特定的HashCode(),假设现在有一个长度一定的数组，我们可以用hashcode对长度求余，
 *      然后根据得到的余数将对象插入数组的位置。
 *      2，又因为两个对象对长度求余值可能相同，所以在存储对象时加入链表的概念。实则是将链表加入数组，而对象则存进链表
 *      
 * map的底层实现为：数组+链表     
 * 
 *
 */
public class MyMap002 {

	LinkedList[] arr=new LinkedList[999];
	int size=0;
	
	//往容器添加元素的方法,升级版根据hashcode来存储,数组加链表来存储
	public void put(Object key,Object value){
		Entry e=new Entry(key,value);
		
		int index=key.hashCode()%arr.length;
		//判断余数的索引位置是有有了链表，若没有，创建一个新的链表，然后添加元素；若已经有了链表，直接往链表中添加元素
		if(arr[index]==null){
			LinkedList list=new LinkedList();
			arr[index]=list;
			arr[index].add(e);
		}else{//若index已经有了链表，遍历链表，若有重复的键，把值覆盖，若没有，直接加入对象
			for(int i=0;i<arr[index].size();i++){
				Entry e2=(Entry) arr[index].get(i);
				
				if(e2.key.equals(key)){
					e2.value=value;
					return;
				}
			}
		arr[index].add(e);
		}
	}
	
	/**
	 * 根据键查询值的方法
	 */
	public Object get(Object key){
		Entry e=new Entry();
		
		//根据hashcode找到索引链表的位置，然后遍历该链表，若查不到，return null;
		int index=key.hashCode()%arr.length;
		for(int i=0;i<arr[index].size();i++){
			e=(Entry)arr[index].get(i);
			if(e.key.equals(key)){
				return e.value;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		MyMap002 map=new MyMap002();
		
		map.put("001", "h y");
		map.put("002", "hyz");
		map.put("003", "hhm");
		map.put("004", "hhc");
		map.put("003", "lyx");
		System.out.println(map.get("003"));
	}
}
