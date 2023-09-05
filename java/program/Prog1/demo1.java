// 数据及其类型
public class demo1{
    public static void main(String[] args){
        int[] a, b;  
        a = new int[4];
        b = new int[4];
        a = b;
        System.arraycopy(a, 0, b, 0, 0);    
        
        for (int element: a){
            System.out.println(element);
        }
    }
}