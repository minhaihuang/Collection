package minhaihuang.Collection.FanXing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试泛型的作用，理解其工作原理与写法
 * @author 黄帅哥
 *
 */
public class FangXIngTest01 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("hhm");
		list.add("hhc");
		list.add("h y");
		list.add("hzy");
		//list.add(1);//会发生编译时错误，提示将1转换为String类型的
		println(list);
	}
	
	
	//遍历一个List容器，添加泛型，确保里面的元素只能是String类型。
	public static void println(List<String> list){
		String str=null;
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			str=it.next();
			System.out.println(str);
		}
	}
}
