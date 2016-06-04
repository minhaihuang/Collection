package minhaihuang.Collection.FanXing;
/**
 * 测试泛型的操作02，泛型可当作一项未知的基本类来使用，在需要时才将其实例化
 * 注意：在静态方法和静态属性中无法使用泛型
 *
 */
public class FanXingTest02<T>{//T表示当前要操作的元素类型不确定，在使用时才将其实例化

//	static T a;错误，在静态属性中无法使用泛型
//	public static void get(T t) 错误，在静态方法中无法使用泛型
	
	//泛型可以当作一项未知的基本类来使用
	public void get(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args){
		
		//在使用时将泛型实例化,这是，T即表示String类型
		FanXingTest02<String> fx=new FanXingTest02<String>();
		
		fx.get("hhm");//打印出hhm
		
		//实例化2，T表示Integer类型
		FanXingTest02<Integer> fx2=new FanXingTest02<Integer>();
		fx2.get(1);//打印出1
	}

}

