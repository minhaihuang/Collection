package minhaihuang.Collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * 测试Properties的常用方法
 * @author 黄帅哥
 *
 */
public class PropertiesTest {

	public static void main(String[] args){
		//1,找到配置文件
		String path=PropertiesTest.class.getResource("/test.properties").getFile();
		
		//2，用流与文件建立联系
		InputStream is;
		
		try {
			is = new FileInputStream(path);
			//3，创建Properties对象
			Properties prop=new Properties();
			
			//用Properties对象加载流。
			prop.load(is);
			
			//获取配置文件的值
			String str=prop.getProperty("黄海敏");
			System.out.println(str);
		} catch (FileNotFoundException e) {
			System.out.println("文件找不到"+e.getMessage());
		} catch (IOException e) {
			System.out.println("读取文件失败"+e.getMessage());
		}
		
		
	}
}
