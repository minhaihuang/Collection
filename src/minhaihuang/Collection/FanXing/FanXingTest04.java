package minhaihuang.Collection.FanXing;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试?通配符，有限制泛型,关键字extends
 * @author 黄帅哥
 *
 */
public class FanXingTest04<T extends Number>{//FanXingTest04的对象只能为Number类型,
	
	//错误，不能传入非数值类型的类
	//FanXingTest04<String> demo=new FanXingTest04<String>();
	
	
	public static void main(String[] args) {
		
		List<?> list=new ArrayList<Integer>();
		//list.add(1);无论添加什么元素，都会报错，所以说?通配符不能单独使用
		
		FanXingTest04<Integer> fx=new FanXingTest04<Integer>();//正确
		fx.show(1);//1
		//FanXingTest04<Double> fx2=new FanXingTest04<Integer>();//错误
		//FanXingTest04<Number> fx3=new FanXingTest04<Integer>();//错误
	}

	public void show(T t){
		System.out.println(t);
	}
}
