package minhaihuang.Collection.setXiti;
/**
 * MyHashSet001的升级版，无论是插入数据还是删除数据，效率都大大提高
 * @author 黄帅哥
 *
 */
public class MyHashSet002 {
	private static final Object PRESENT = new Object();
	MyMap002 map=new MyMap002();
	
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
		return map.keySet();
	}
	
	public static void main(String[] args) {
		MyHashSet002 map=new MyHashSet002();
		
		map.add(1);
		map.add(2);
		map.add(3);
		map.add(4);
		map.add(5);
		map.add(6);
		map.add("hhm");
		Object[] obj=map.printlnAllElements();
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
	}
}
