class Element
{ 
	private int n;
	private Element next;
	public void setNum(int num) {
		n = num;
	}
	public void setNext(Element nextElement) { 
		next = nextElement;
	}
	public int getNum() {
		return n;
	}
	public Element getNext() {
		return next;
	}
}
class LinkedList
{
	Element first = null; 
	Element last = null; 
	public void add(Element e) {
		if(last == null) {
			first = new Element(); 
			first.setNum(e.getNum());
			last = first;
		}
		else {
			Element newLast = new Element();
			newLast.setNum(e.getNum());
			last.setNext(newLast);
			last = newLast;
		} 
	}
	public boolean delete(Element e) { 
		boolean flag = false;
		Element virtualElement = new Element();
		virtualElement.setNext(first);
		//这里就相当于对链表进行一个赋值操作
		Element curElement = virtualElement; 

		//新加代码
		// first.setNext(curElement);

		Element nextElement; 
		while(true) {
			nextElement = curElement.getNext(); 
			if(nextElement == null)	{
				break;
			}
			if(nextElement.getNum() == e.getNum()) {//remove nextElement 
				flag = true;
				if(nextElement == last)	{
					// 第一处错误
					// last = curElement;  
					last = null;
				}
				
				curElement.setNext(nextElement.getNext()); 
			}

			//新加部分 
			else if (nextElement.getNum() != e.getNum()){
				curElement = curElement.getNext(); 
			}

			// 第二处错误
			// curElement = curElement.getNext(); 

			if(curElement == null)	{
				break;
			}
		}  

		first = virtualElement.getNext();
		
		return flag;
	}

	public boolean isExist(Element e) {  
		Element curElement = first;  
		if(curElement == null) {
			return false;
		}
		while(true) { 
			if(curElement.getNum() == e.getNum())	{
				return true;
			} 
			curElement = curElement.getNext(); 
			if(curElement == null)	{
				return false;
			}
		}  
	}
	public void print() {  
		Element curElement = first;   
		while(curElement != null) { 
			System.out.print(curElement.getNum() + " ");
			curElement = curElement.getNext();   
		}  
		System.out.println();
		System.out.println("---------------");
		return;
	}

	public void display() {
        Element cur = this.first;
        while (cur != null) {
            System.out.print(cur.getNum() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
}

public class LinkedListTest_re
{
	public static void main(String argv[])
	{
		Element e = new Element();
		Element f = new Element();
		Element g = new Element();
		Element h = new Element();
		Element i = new Element();
		Element j = new Element();
		e.setNum(2);
		f.setNum(2);
		g.setNum(2);
		h.setNum(2);
		i.setNum(2);
		j.setNum(2);
		LinkedList list = new LinkedList();
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(i);
		list.add(j);
		list.display();
		System.out.println(list.delete(g));
		list.display();
		System.out.println("------------");
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(i);
		list.add(j);
		list.display();
		System.out.println(list.delete(g));
		list.display();
	}
}
/*
 * 花了我三个半小时找这个Bug, 好好想想为什么（包括自己写的程序）
 * 经过这个训练，对指针和链表的理解应该要更深一点
 * 几个问题：程序命名不要相同、要知道自己调试的是哪个程序（特别是待调试的程序存在死循环的时候）
 * 要学会定位、学会调试
 */
