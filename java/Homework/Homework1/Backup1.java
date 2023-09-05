// package Homework1;

// //import java.util.List;

// class Element {
//     private int n;// 数据域
//     private Element next;// 指针域

//     public Element(int n) {
//         this.n = n;
//     }

//     public int getNum() {
//         return n;
//     }

//     public Element getNext() {
//         return next;
//     }

//     public void setNum(int a) {
//         this.n = a;
//     }

//     public void setNext(int a) {
//         this.next = new Element(n);
//     }

//     /*
//      * Description: 递归地查找data位于链表哪个序号
//      * return : -1(表示未找到)
//      */
//     public boolean isExist(int n) {
//         if (this.n == n) // 已找到
//         {
//             return true;
//         } else if (getNext() == null) // 未找到
//         {
//             return false;
//         }

//         return this.next.isExist(n);
//     }

//     /*
//      * Description: 递归地查找data,并删除
//      * data: 要找的data
//      * PreNode: 上个节点,如果为null则当前位于表头
//      * index: 表示当前位于链表哪个序号
//      * return : -1(表示未找到) 0~(len-1) (表示data位于链表哪个序号)
//      */
//     public boolean delete(int n, Element Pre) {
//         if (this.n == n) // 删除
//         {
//             Pre.next = this.next;
//             return true;
//         } else if (getNext() == null) // 未找到
//         {
//             return false;
//         }

//         return this.next.delete(n, this);
//     }

//     /*
//      * Description: 添加节点
//      * return :
//      */
//     public void add(int n) {
//         // Element node = e;
//         // node.setNum(e.getNum());
//         if (getNext() != null) {
//             this.next.add(n);
//         } else {
//             this.setNext(n);
//         }
//     }
// }

// class LinkedList {
//     private Element first;
//     private int len;

//     public LinkedList(int n) {
//         first = new Element(n);
//         len = 1;
//     }

//     public boolean isExist(Element e) {
//         // 遍历，求出链表的长度
//         if (len >= 0) // 链表有数据
//         {
//             return (first.isExist(e.getNum())); // 从序号0开始找
//         }
//         return false;
//     }

//     /*
//      * Description: 删除一个节点数据
//      * return : -1(未找到要删除的数据) 0~(len-1) (表示data位于链表哪个序号)
//      */
//     public boolean delete(Element e) {
//         int ret = -1;
//         if (len >= 0) // 链表有数据
//         {
//             if (this.first.getNum() == e.getNum()) // 删除表头需要特殊处理
//             {
//                 this.first = this.first.getNext();
//                 ret = 0;
//             } else
//                 return (first.delete(e.getNum(), this.first));
//         }

//         if (ret != -1) // 已删除
//         {
//             len--;
//             return true;
//         }

//         return false;
//     }

//     /*
//      * Description: 添加一个节点数据
//      * return :
//      */
//     public void add(Element e) {
//         this.first.add(e.getNum());
//         len++;
//     }

// }

// public class Backup1 {
//     public static void main(String argv[]) {
//         Element e = new Element();
//         LinkedList list = new LinkedList();
//         e.setNum(1);
//         list.add(e);
//     }
// }
