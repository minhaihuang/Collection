package minhaihuang.Collection.Arrays;

import java.util.Arrays;

/**
 * 测试Arrays工具类的一些常用方法,更多的是操作数组
 * @author 黄帅哥
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		int[] a={1,2,4,3,5,6};
		
		//1，sort(数组名)方法，可以对数组元素进行排序，可以对各种类型的数组进行排序
		Arrays.sort(a);//对数组进行排序，可以传入各种类型的数组
		
		//2，String toString(数组名);将数组里面的元素转换成一个字符串输出,各种数组
		String s=Arrays.toString(a);//将数组里面的元素转换成一个字符串输出
		System.out.println(s);
		
		//3，copyOf(数组名，长度)，赋值数值到另外一个数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
		int[] a2=Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(a2));//1,2
		
		//4，binarySearch(数组名，元素)，找到元素在数组中的索引位置,索引从0开始算起
		int index=Arrays.binarySearch(a, 2);
		System.out.println(index);//1
		
		//5，equals(数组名1,数组名2),判断两个数组是否相等
		System.out.println(Arrays.equals(a, a2));
		
		//6，hashCode(数组名),计算数组的哈希码
		
		//7，List<T> asList(T... a) 返回一个受指定数组支持的固定大小的列表。 不能添加或删除，只能查找，或者改变值，只支持同类型数据的更改
			//注意。里面传的不是数组名
	}
}
