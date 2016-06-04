package minhaihuang.Collection.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 建立一个数据结构，存储一个学校的所有年级的所有学生的所有成绩
 * @author 黄帅哥
 *
 */
public class StudentTest {

	    //创建一个Map容器，用来存储学生的信息
		Map<String,Object[]> map=new HashMap<String,Object[]>();
		
	public void addElements(String number,String name,int grade,int banji,
			int score1,int score2,int score3){
		
		//创建一个数组，分别为各个索引赋值，学号作为map容器的key
		Object[] value=new Object[6];
		value[0]=name;
		value[1]=grade;
		value[2]=banji;
		value[3]=score1;
		value[4]=score2;
		value[5]=score3;
		
		//创建一个新的学生类对象
		Student s=new Student(number,value);
		
		//往map容器中添加学生对象,学号为键
		map.put(number, value);
	}
	
	public Object[] getMessage(String number){
		
		//若容器中包含该学生的学号
		if(map.containsKey(number)){
			//准备返回的数组
			Object[] value=new Object[6];
			
			//遍历容器，往容器中查找该学生的信息
			Set<String> set=map.keySet();
			//用迭代器遍历
			Iterator<String> it=set.iterator();
			while(it.hasNext()){
				String s=it.next();
				value=map.get(s);
			}
			
			return value;
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		StudentTest st=new StudentTest();
		
		st.addElements("001", "h y", 3, 1, 80, 90, 90);
		st.addElements("002", "hzy", 3, 1, 80, 80, 90);
		st.addElements("003", "hhm", 3, 1, 90, 90, 90);
		st.addElements("004", "hhc", 3, 1, 85, 95, 90);
		
		Object[] value=st.getMessage("003");
		System.out.println(Arrays.toString(value));
	}
}

//创建一个学生类，第一个变量是学生的学号，第二个变量是一个数组，里面存储的分别是姓名，年级，班级，语文成绩，数学成绩，英语成绩
class Student{
	String number;
	Object[] value;
	
	//创建一个无参构造，以满足各种需求
	public Student(){
		
	}
	
	//创建一个带参构造，初始化数据
	public Student(String number, Object[] value) {
		super();
		this.number = number;
		this.value = value;
	}
	
	
}