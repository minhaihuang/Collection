package minhaihuang.Collection.setXiti;

import java.util.Comparator;

/**
 * 要求：将一个字符串数组中的元素按照长度进行降序排序，若长度相同，则按照字符串的正常排序
 * @author 黄帅哥
 *
 */
public class SortString{

	public static void main(String[] args) {
		String[] str={"hhm","hzy","hhhm","gc","h y","b","a","hhy"};
		
		//str=strCom01(str);
		str=strCom02(str,new StringCompare());
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
	
	
	
	//第一种方法，不实现任何借口，直接根据遍历数组的方法
	public static String[] strCom01(String[] str){

		String temp=null;
		boolean flag=true;//定义一个标识符，节省循环的次数
		//循环遍历String数组
		for(int i=0;i<str.length-1;i++){
			flag=true;//每一次循环之前，默认值标识符为true
			for(int j=0;j<str.length-1;j++){
				
				//如果前一个字符串的长度小于后一个的，将两者互换位置
				if(str[j].length()<str[j+1].length()){
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					
					//如果两个字符串的长度相等，按照自然顺序排列
				}else if(str[j].length()==str[j+1].length()){
					  if(str[j].compareTo(str[j+1])>0){
						    temp=str[j];
							str[j]=str[j+1];
							str[j+1]=temp;
					  }
				}
				
				flag=false;
			}
			//如果一次变量所有的字符串后，标识符的值任然没有改变，说明已经不需要再遍历，跳出循环
			if(flag){
				break;
			}
			
		}
		
		return str;
	}
	
	//方法二，实现Comparator接口，重写compare方法，建议使用此种方法
 	public static String[] strCom02(String[] str,Comparator com){
 		String temp=null;
		boolean flag=true;//定义一个标识符，节省循环的次数
		//循环遍历String数组
		for(int i=0;i<str.length-1;i++){
			flag=true;//每一次循环之前，默认值标识符为true
			for(int j=0;j<str.length-1;j++){
				
				//调用compare()方法进行比较
				if(com.compare(str[j], str[j+1])>0){
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					}
				flag=false;
				}
			//如果一次变量所有的字符串后，标识符的值任然没有改变，说明已经不需要再遍历，跳出循环
			if(flag){
				break;
			}
		}
		return str;
 }
}

//定义一个外部类来实现Comparator接口，实现compare方法
class StringCompare implements Comparator{

	public int compare(Object o1, Object o2) {
		String str1=(String)o1;
		String str2=(String)o2;
		
		if(str1.length()!=str2.length()){
			 return str2.length()-str1.length();
		}
		
		return str1.compareTo(str2);
		}
	
	}
