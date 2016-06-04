package minhaihuang.Collection.zengQiangFor;

import java.util.ArrayList;
import java.util.List;

/**
 * 学会用增强for来遍历数组与容器
 * @author 黄帅哥
 *
 */
public class StrongerFor {

	public static void main(String[] args) {
		/*
		 //1,创建容器
		List<Integer> list=new ArrayList();
		
		//为容器加入元素
		for(int i=0;i<10;i++){
			list.add(i);
		}
		
		//用增强for来变量容器
		for(Integer i:list){
			System.out.println(i);
		}*/
		
		//1,创建数组
		int[] a={1,2,3,4,5,6};
		//用增强for遍历数组
		for(int i:a){
			System.out.println(i);
		}
	}
}
