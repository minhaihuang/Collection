package minhaihuang.Collection.setXiti;

/**
 * 要求：自己定义一个HashSet类，简单实现add(Object o),remove(Object o),还printlnAllElements()
 * 不适任何接口
 * @author 黄帅哥
 *
 */

//思路分析：HastSet是Set的实现类，而Set的底层是map,通过源码分析可知，hashSet的add(),remove(),iterator()
//都是通过map来实现的，所以，先自己写一个MyMap。再实现MyHashSet
public class MyHashSet001 {
	private static final Object PRESENT = new Object();
	MyMap001 map=new MyMap001();
	
	public int size(){
		return map.size;
	}
	
	public  void add(Object obj){
		map.put(obj, PRESENT);
	}
	
	public Object remove(Object obj){
		return map.remove(obj);
	}
	
	public Object[] printlnAllElements(){
		map.keySet();
		return null;
	}
	
	public static void main(String[] args) {
		MyHashSet001 map=new MyHashSet001();
		
		map.add(1);
		map.add(2);
		map.add(3);
		map.add(4);
		map.add(5);
		map.add(6);
		map.printlnAllElements();
	}
}

/**
 * 自己来实现map里面的方法
 * 此版本无论插入数据，还是查询数据，效率都较低，所以在MyMap02中进行改进与升级
 * @author 黄帅哥
 *
 */
class MyMap001 {
	Entry01[] entry=new Entry01[999];
	static int size=0;
	
	//往容器添加元素的方法
	public void put(Object key,Object value){
		Entry01 e=new Entry01(key,value);
		
		//输入的数据中键不能重复，若重复，则后面的value值覆盖前面的value值
		for(int i=0;i<size;i++){
			if(entry[i].key.equals(key)){
				entry[i].value=value;
			}
		}
		
		entry[size++]=e;
		
	}
	
	//获取所有键的方法
	public void keySet(){
		Object[] obj=new Object[size];
		for(int i=0;i<size;i++){
			obj[i]=entry[i].key;
			System.out.println(obj[i]);
		}
		
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
}

//定义一个入口类，存储对象等等
class Entry01{
	//不能是static 变量，否则后面的键改变的话，前面的键也跟着该变
	   Object key;
	   Object value;
	
	public Entry01(Object key,Object value){
		super();
		this.key=key;
		this.value=value;
	}
	
	public Entry01(){
		
	}
}
