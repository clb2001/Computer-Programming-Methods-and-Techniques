// package Homework1;

// //import java.util.List;

// class Element {
//     private int n;//数据域
//     private Element next;//指针域

//     public Element(int n){
//         this.n = n;
//     }

//     public int getNum() {
//         return n;
//     }

//     public Element getNext(){
//         return next;
//     }

//     public void setNum(int a) {
//         this.n = a;
//     }

//     public void setNext(int a) {
//         this.next = new Element(n);
//     }

//     public boolean isExist(int n) {
//         // 遍历，求出链表的长度
//         Element cur = this.first;
//         while (cur != null){
//             if (cur.getNum() == e.getNum()){
//                 return true;
//             }
//             cur = cur.next;
//         }
//         return false;
//     }

//     /*Description:  递归地查找data,并删除
//      *data: 要找的data
//      *PreNode:    上个节点,如果为null则当前位于表头
//      *index: 表示当前位于链表哪个序号
//      *return  :  -1(表示未找到) 0~(len-1) (表示data位于链表哪个序号)         
//      */ 
//     public boolean delete(int n, Element Pre) {
//         if(this.n == n)    //删除
//         {
//             Pre.next = this.next;
//             return true;
//         }
//         else if (getNext()==null)    //未找到
//         {
//             return false;
//         }

//         return this.next.delete(n, this);
//     }

//     /*Description: 添加节点
//      *return     :  
//      */ 
//     public void add(int n) {
//         //Element node = e;
//         //node.setNum(e.getNum());
//         if (getNext() != null){
//             this.next.add(n);
//         }
//         else{
//             this.setNext(n);
//         }
//     }
// }

// class  Backup{
//     private Element first;

//     public boolean isExist(Element e) {
//         // 遍历，求出链表的长度
//         Element cur = this.first;
//         while (cur != null){
//             if (cur.getNum() == e.getNum()){
//                 return true;
//             }
//             cur = cur.next;
//         }
//         return false;
//     }

//     public boolean delete(Element e) {
//         if (this.first == null){
//             System.out.println("删除失败");
//             return false;
//         }
//         Element prev = this.first;
//         Element cur = this.first.next;
//         while (cur != null){
//             if (cur.getNum() == e.getNum()){
//                 prev.next = cur.next;
//                 cur = cur.next;
//             }
//             else{
//                 prev = cur;
//                 cur = cur.next;
//             }
//         }
//         if (this.first.getNum() == e.getNum()){
//             this.first = this.first.next;
//         }
//         return true;
//     }

//     public void add(Element e) {
//         Element node = e;
//         //node.setNum(e.getNum());
//         if (this.first == null){
//             this.first = node;
//         }
//         else{
//             Element cur = this.first;
//             while (cur.next != null){
//                 cur = cur.next;
//             }
//             cur.next = node;
//         }
//     }

// }

// public class LinkedListTest {
//     public static void main(String argv[]) {
//         Element e = new Element();
//         LinkedList list = new LinkedList();
//         e.setNum(1);
//         list.add(e);
//     }
// }
