class Element {
    private int n;// 数据域
    private Element next;// 指针域

    /*
     * Description: 获得节点中的数据
     */
    public int getNum() {
        return n;
    }

    /*
     * Description: 获得节点的下一个节点
     */
    public Element getNext() {
        return next;
    }

    /*
     * Description: 确定节点中的数据
     */
    public void setNum(int num) {
        this.n = num;
    }

    /*
     * Description: 确定节点的下一个节点
     */
    public void setNext(Element e) {
        this.next = e;
    }
}

class LinkedList {
    // private Element first;
    Element first = null;
    public boolean isExist(Element e) {
        Element cur = this.first;
        while (cur != null){
            if (cur.getNum() == e.getNum()){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    /*
     * Description: 删除一个节点数据
     * return : true 成功删除； false 未成功删除
     */
    public boolean delete(Element e) {
        /*
         * 为空链表，直接返回false
         */
        if (this.first == null){
            return false;
        }
        int i = 0;
        Element prev = this.first;
        Element cur = this.first.getNext();
        while (cur != null){
            if (cur.getNum() == e.getNum()){
                prev.setNext(cur.getNext());
                cur = cur.getNext();
                i += 1; 
            }
            else{
                prev = cur;
                cur = cur.getNext();
            }
        }
        if (this.first.getNum() == e.getNum()){
            this.first = this.first.getNext();
            i += 1;
        }
        if (i > 0){
            return true;
        }
        else{
            return false;
        }
    }

    /*
     * Description: 添加一个节点数据
     * return :
     */
    public void add(Element e) {
        Element node = e;//这里不能这么定义，应该重新定义一个New的element，否则e指向的节点不一定是null, 还是没注意到
        if (this.first == null){
            this.first = node;
        }
        else{
            Element cur = this.first;
            while (cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(node);
        }
    }

    /*
     * 打印顺序表
     */
    public void display() {
        Element cur = this.first;
        while (cur != null) {
            System.out.print(cur.getNum() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
}

public class LinkedListTest {
    public static void main(String argv[]) {
        // Element e = new Element();
        // LinkedList list = new LinkedList();
        // e.setNum(1);
        // list.add(e);
        /*
         * 测试用例
         */
        Element e = new Element();
		Element f = new Element();
		Element g = new Element();
		Element h = new Element();
		Element i = new Element();
		Element j = new Element();
		e.setNum(2);
		f.setNum(2);
		g.setNum(2);
		h.setNum(1);
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