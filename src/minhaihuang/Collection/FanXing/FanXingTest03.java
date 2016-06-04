package minhaihuang.Collection.FanXing;

import java.util.ArrayList;
import java.util.List;

public class FanXingTest03<T> implements Person{

	public void show(Integer i){
		
	}
	public static void main(String[] args) {
		Person<Object> p=new FanXingTest03<String>();//1
		//List<Object> list=new ArrayList<String>();	//2
		 
		/* List<String> list=new ArrayList();
		 List list2=new ArrayList<String>();
		 //list.add(1);错误，只能加入String类型的
		 list2.add(1);//正确
		 //总结，能加入什么元素，注意根据左边的类型限制*/
	}
}


interface Person<Object>{
	
}



