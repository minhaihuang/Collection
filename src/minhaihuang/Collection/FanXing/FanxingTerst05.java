package minhaihuang.Collection.FanXing;
/**
 * 测试泛型通配符
 * @author 黄帅哥
 *
 */
public class FanxingTerst05<T>{

	
	public static void main(String[] args) {

		FanxingTerst05<? extends Number> fx=new FanxingTerst05<Number>();
		//fx.show();//当有了泛型通配符时，无法调用带泛型参数的方法
	}
	

	public void show(T t){
		
	}
}
