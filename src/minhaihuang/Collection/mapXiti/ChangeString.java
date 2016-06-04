package minhaihuang.Collection.mapXiti;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 要求：将一个字符串的所有字符转换为中文字符
 * @author 黄帅哥
 *
 */
public class ChangeString {

	public static void main(String[] args) {
		Map<String,String> map=addToMap();
		String str="hello,我爱你";
		
		//利用StringBuilder类，提高字符追加的效率
		StringBuilder s=new StringBuilder();
		String s1=null;
		for(int i=0;i<str.length();i++){
				//将char类型的字符转换为单个字符串
				char ch=str.charAt(i);
				s1=Character.toString(ch);
				
				//在容器中获取到繁体字，
				s1=map.get(s1);
				if(s1!=null){
					s.append(s1);//若获取到的繁体字不为空，直接添加到s的后面
				}else{
					s.append(ch);//若获取到的繁体字为空，将原来的字符加入s。
				}
		}
		System.out.println(s);
	}
	
	public static HashMap<String,String> addToMap(){
				//1,获取文件
				String filePath=ChangeString.class.getResource("/minhaihuang/Collection/mapXiti/jf_map_utf8.properties").getFile();
				
				//读取文件,添加到容器
				//准备流
				InputStream is=null;
				InputStreamReader isr=null;
				BufferedReader br=null;
				
				//准备容器
				 HashMap<String, String> map=new HashMap<String,String>();
				try{
					is=new FileInputStream(filePath);
					isr=new InputStreamReader(is);
					br=new BufferedReader(isr);
					
					String line=null;
					while((line=br.readLine())!=null){
						
						//分割字符串，获得简体和繁体两部分的内容
						if(line.trim().length()!=0){
						String[] str=line.split(":");
						
						//添加到容器，简体为key,繁体为value
						map.put(str[0], str[1]);
						}
					}
					
				}catch(FileNotFoundException e){
					System.out.println("文件找不到"+e.getMessage());
					
				} catch (IOException e) {
					System.out.println("读取 文件失败"+e.getMessage());
				}finally{
					//关闭流
					if(br!=null){
						try {
							br.close();
						} catch (IOException e) {
							
						}
					}
					
					if(isr!=null){
						try {
							isr.close();
						} catch (IOException e) {
							
						}
				}
					
					if(is!=null){
						try {
							is.close();
						} catch (IOException e) {
							
						}
					}
				}
				
				return map;
	}
}
