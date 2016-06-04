package minhaihuang.Collection.list;
/**
 * 自己尝试实现linkedList的链表插入数据功能
 * @author 黄帅哥
 *
 */
public class MyLinkedList {

   private static Node first;//第一个节点，链首
	
	public static void add(Object obj){
		//加入数据
		Node node=new Node();
		node.setData(obj);
		
		//若第一个节点为空，直接插入第一个节点，结束方法
		if(first==null){
			first=node;
			return;
		}else{//若第一个节点不为空
			/*//定义一个临时变量，指向第一个节点
			Node temp=first; 
			第一种写法
			while(true){//在链表中不断寻找，直到寻找到最后一个节点
				
				temp=temp.getNext();//指向下一个节点
				if(temp==null){//若当前节点为空，则将新的对象插入到这里，使其成为最后一个节点，结束方法
					temp=node;
					return;
				}*/
			//第二种写法
			
			//定义一个临时变量，指向第一个节点
			Node temp=first; 
			while(true){//在链表中不断寻找，直到寻找到最后一个节点
				//指向下一个节点，用一个新的节点对象获取
				Node next=temp.getNext();
				if(next==null){//若当前节点为空，则将新的对象插入到这里，使其成为最后一个节点，结束方法
					temp.setNext(node);
					return;
				}else{
					//改变temp的值，使其变为下一个节点
					temp=temp.getNext();
				}
			}
		}
	}
	
	
}

//定义一个节点类，有两个变量，一个用来存储数据，一个用来指向下一个节点
class Node{
	Object data;
	Node next;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}