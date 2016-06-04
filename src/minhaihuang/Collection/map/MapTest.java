package minhaihuang.Collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试一下map里面的方法
 * @author 黄帅哥
 *
 */
public class MapTest {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put("hhm", "003");
		map.put("hzy", "002");
		map.put("h y", "001");
		map.put("hhc", "004");
		Object obj=map.put("hhm", "005");
	
		System.out.println(obj);//返回003。当键重复时，后一个值将覆盖前一个值，然后返回前一个值，
		System.out.println(map.containsKey("hhm"));
		System.out.println(map.containsValue("005"));
		System.out.println(	map.get("hhm"));
	}
}
