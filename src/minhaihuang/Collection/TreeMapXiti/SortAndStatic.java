package minhaihuang.Collection.TreeMapXiti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *要求： 统计一篇文章中每个字符出现的次数，并且按照自然顺序排列，输出到控制台
 * @author 黄帅哥
 *
 */
public class SortAndStatic {

	public static void main(String[] args) {
		
		//1，创建map容器，键位String类型，值为Integer类型、
		TreeMap<Character,Integer> map=new TreeMap<Character, Integer>();
		
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
			 
			 //遍历map容器，通过keySet来获取值
			 Set<Character> set=map.keySet();
			 System.out.println(map.size());
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
