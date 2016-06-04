package minhaihuang.Collection.map;

public class Test01 {

	public static void main(String[] args) {
		String[] str={"1","2","3"};
		String[] s=test(str);
	}
	
	public static String[] test(String[] str){
		String[] s=new String[str.length];
		for(int i=0;i<str.length;i++){
			s[i]=str[i];
		}
		
		return s;
	}
}
