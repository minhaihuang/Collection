package minhaihuang.Collection;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {

		Collection<String> con = new ArrayList();

		Collection con2 = new ArrayList();

		System.out.println(con.add("123"));
		con.add("22534");
		con.add("1345");

		System.out.println(con.remove("123"));

		System.out.println(con.equals(con2));

		System.out.println(con.size());

		con2.add("123");
		con2.add("22534");
		con2.add("1345");
		con2.add(1234);

		System.out.println(con2.containsAll(con));

		Iterator it = con2.iterator();

		while (it.hasNext()) {

			Object obj = it.next();

			// con2.remove(obj);// 不能再迭代器中中使用非本迭代器的移除方法
			System.out.println(obj);
		}

		it.remove();// 移除迭代器返回的最后一个元素
		System.out.println(con2.size());// size本来为4，现在为3，已经移除类最后的1234

		Iterator it2 = con2.iterator();
		while (it2.hasNext()) {
			Object obj = it2.next();
			System.out.println(obj);
		}
	}

}
