package week9;

class Node {
    private E n;// 数据域
    private Node next;// 指针域

    /*
     * Description: 获得节点中的数据
     */
    public E getElement() {
        return n;
    }

    /*
     * Description: 获得节点的下一个节点
     */
    public Node getNext() {
        return next;
    }

    /*
     * Description: 确定节点中的数据
     */
    public void setElement(E num) {
        this.n = num;
    }

    /*
     * Description: 确定节点的下一个节点
     */
    public void setNext(Node e) {
        this.next = e;
    }
}

class LinkedList {
    Node first = null;
    // Node last = null;

    public boolean isExist(Node e) {
        Node cur = this.first;
        while (cur != null){
            if (cur.getElement() == e.getElement()){
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
    public boolean delete(Node e) {
        /*
         * 为空链表，直接返回false
         */
        if (this.first == null){
            return false;
        }
        boolean flag = false;
        Node prev = this.first;
        Node cur = this.first.getNext();
        while (cur != null){
            if (cur.getElement() == e.getElement()){
                prev.setNext(cur.getNext());
                cur = cur.getNext();
                flag = true; 
            }
            else{
                prev = cur;
                cur = cur.getNext();
            }
        }
        if (this.first.getElement() == e.getElement()){
            this.first = this.first.getNext();
            flag = true;
        }
        return flag;
    }

    /*
     * Description: 添加一个节点数据
     * return :
     */
    public void add(Node e) {
        Node node = new Node();
        node.setElement(e.getElement());
        if (this.first == null){
            this.first = node;
        }
        else{
            Node cur = this.first;
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
        Node cur = this.first;
        while (cur != null) {
            System.out.print(cur.getElement() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
}

public class LinkedListGen {
    public static void main(String argv[]) {
        // Node e = new Node();
        // LinkedList list = new LinkedList();
        // e.setElement(1);
        // list.add(e);
        /*
         * 测试用例
         */
        Node e = new Node();
		Node f = new Node();
		Node g = new Node();
		Node h = new Node();
		Node i = new Node();
		Node j = new Node();
		e.setElement(2);
		f.setElement(2);
		g.setElement(2);
		h.setElement(1);
		i.setElement(2);
		j.setElement(2);
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
