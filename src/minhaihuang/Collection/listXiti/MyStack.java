package minhaihuang.Collection.listXiti;

import java.util.ArrayList;

/**
 * 模拟堆栈的原理
 * 堆栈的特点：后进先出
 * @author 黄帅哥
 *
 */
public class MyStack {

	ArrayList arr=new ArrayList();
	
	public void add(Object obj){
		arr.add(obj);
	}
	
	public Object remove(int index){
		Object obj=arr.remove(index);
		return obj;
	}
	
	public static void main(String[] args) {
		MyStack st=new MyStack();
		st.add(123);
		st.add("123");
		st.add("456");
		
		//没意思

	}
}
