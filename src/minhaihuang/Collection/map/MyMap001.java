package minhaihuang.Collection.map;

import java.util.Arrays;

/**
 * 自己来实现map里面的方法
 * 此版本无论插入数据，还是查询数据，效率都较低，所以在MyMap02中进行改进与升级
 * @author 黄帅哥
 *
 */
public class MyMap001 {
	Entry[] entry=new Entry[999];
	int size=0;
	
	//往容器添加元素的方法
	public void put(Object key,Object value){
		Entry e=new Entry(key,value);
		
		//输入的数据中键不能重复，若重复，则后面的value值覆盖前面的value值
		for(int i=0;i<size;i++){
			if(entry[i].key.equals(key)){
				entry[i].value=value;
			}
		}
		
		entry[size++]=e;
		
	}
	
	//通过键获取值的查询方法
	public Object get(Object key){
		
		for(int i=0;i<size;i++){
			
			if((entry[i].key).equals(key)){
				return entry[i].value;
			}
		}
		
		return null;
	}
	
	//容器中是否包含指定的键
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(entry[i].key.equals(key)){
				return true;
			}
		}
		
		return false;
	}
	
	//容器中是否包含指定的值
	public boolean containsValue(Object value){
			for(int i=0;i<size;i++){
				if(entry[i].value.equals(value)){
					return true;
				}
			}
			
			return false;
		}
	
	//通过键删除对象的方法
	public Object remove(Object key){
		Object value=null;
		for(int i=0;i<size;i++){
			if(entry[i].key.equals(key)){
				value=entry[i].value;
					
			System.arraycopy(entry, i+1, entry, i, size-i-1);
			size--;
			}
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		MyMap001 map=new MyMap001();
		
		map.put("hhm", "003");
		map.put("hhc", "004");
		map.put("h y", "001");
		map.put("hyz", "002");
		System.out.println(map.size);
		System.out.println(map.get("hhm"));
		System.out.println(map.containsKey("hhm"));
		System.out.println(map.containsKey("hh"));
		System.out.println(map.containsValue("003"));
		System.out.println(map.remove("hhm"));
		System.out.println(map.size);
	
	}
}

//定义一个入口类，存储对象等等
class Entry{
	//不能是static 变量，否则后面的键改变的话，前面的键也跟着该变
	   Object key;
	   Object value;
	
	public Entry(Object key,Object value){
		super();
		this.key=key;
		this.value=value;
	}
	
	public Entry(){
		
	}
}
