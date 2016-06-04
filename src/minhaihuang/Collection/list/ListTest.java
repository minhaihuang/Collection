package minhaihuang.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		
		list.add("1234");
		list.add("1223344");
		list.add("hhm");
		
		System.out.println(list.get(2));//index的值从0开始
		
	}
}
