package minhaihuang.Collection.TreeMapXiti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 要求： 统计一篇文章中每个字符出现的次数，并且按照次数的降序进行排列，打印到控制台
 * @author 黄帅哥
 *
 */
public class SortNumber {

public static void main(String[] args) {
		
		
		//1，创建map容器，键位String类型，值为Integer类型、
		TreeMap<Character,Integer> map=new TreeMap<Character, Integer>();
		
		//创建一个自己的比较器对象
		MyComparator myCom=new MyComparator(map);
		
		//创建一个新的TreeMap,加入旧的容器里的对象，使其能够按照自己定下的规则排序。注意构造方法的不同
		TreeMap<Character,Integer> map2=new TreeMap<Character, Integer>(myCom);
		
		//2,利用IO流逐字符读取文件
		
		//2.1，找到文件的位置
		 String path="f:/a/1.txt";
		//2.2,选择流，输入流,利用reader来逐字符读取
		 InputStream is=null;
		 InputStreamReader isr=null;
		 try{
			 is=new FileInputStream(new File(path));
			 isr=new InputStreamReader(is);
			 
			 int i=0;
			 isr.read();//丢弃掉第一个字符
			 while((i=isr.read())>0){
				 Character a=(char)i;

				 //如果字符不为空，判断容器里是否已经有了该字符。
				 if((!a.equals('\00'))&&(!a.equals(' '))&&(!a.equals('\n'))&&(!a.equals('\r'))&&(!a.equals('\t'))){
					 //没有，加入，初始值为1
					if(!map.containsKey(a)){
						map.put(a, 1);
					}else{
					//若已经包含，取得值，将其加1后重新加入容器
						int value=map.get(a);
						value+=1;
						map.put(a,value);
					}
				 }
			 }
			 
			 //将旧容器的对象全部加入到新容器进行排序，按照自己的规则排序。
			 map2.putAll(map);
			 
			 //遍历map2容器，通过keySet来获取值
			 Set<Character> set=map2.keySet();

			 Iterator it=set.iterator();
			 while(it.hasNext()){
				 Character s=(Character) it.next();
				 int value=map.get(s);
				 System.out.println(s+" 出现的次数为："+value);
			 }
			 
		 	}catch(FileNotFoundException e){
		 		System.out.println("文件找不到"+e.getMessage());
		 	} catch (IOException e) {
				System.out.println("文件读取失败"+e.getMessage());
			}finally{
				if(isr!=null){
					try {
						isr.close();
					} catch (IOException e) {
						//
					}
				if(is!=null){
					try {
						is.close();
					} catch (IOException e) {
						//
					}
				}
				}
			}
		}
}

//自己定义一个排序的类（比较器），让元素根据自己定义的排序规则添加到TreeMap里面
//现在是定义按照字符出现的次数进行排列，若次数相同，按照字符的自然顺序排列
class MyComparator implements Comparator{

	 private Map<Character,Integer> map;
	//要提供一个Map来获取value
	 MyComparator(Map<Character,Integer> map){
		this.map=map;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer num1=map.get(o1);
		Integer num2=map.get(o2);
		
		if(num1==null||num2==null){
			return 1;
		}
		
		if(num1.equals(num2)){
			return o1.toString().compareTo(o2.toString());
		}
		return num2.compareTo(num1);
	}
	
}
