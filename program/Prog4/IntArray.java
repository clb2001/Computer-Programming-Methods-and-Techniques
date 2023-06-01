

import java.util.Scanner;

class IntClass {
    private int num;// 存放数字

    public IntClass(int num) {
        this.num = num;
    }// 构造方法

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}


public class IntArray {
    public static void main(String[] args) {
        int count = 1;
        int redFlag = 1;
        IntClass a[] = new IntClass[1];
        a[0] = new IntClass(89);
        Scanner scan = new Scanner(System.in);
        IntArray test = new IntArray();
        System.out.println("Welcome to IntArray: ");
        while (redFlag == 1) {
            test.putMenu();
            int data0 = scan.nextInt();
            switch (data0) {
                case 0:
                    redFlag = 0;
                    break;
                case 1:
                    test.putAllIntClass(a, count);
                    break;
                case 2:
                    a = test.add(a, count, scan);
                    count++;

                    // 如果数组中已实例化元素个数等于a的长度，扩容
                    break;
                case 3:
                    test.isExist(a, count, scan);
                    break;
                case 4:
                    int nthnum = test.getnthNumber(a, count, scan);
                    break;
                case 5:
                    a = test.delete(a, count, scan);
                    count--;
                    break;
            }

        }

    }

    void putMenu() {
        System.out.println("<————————————————————>");
        System.out.println("请输入你所要操作的项目标号");
        System.out.println("1.显示所有数字信息");
        System.out.println("2.录入数字信息");
        System.out.println("3.查询数字是否存在");
        System.out.println("4.查询第n大的数字信息");
        System.out.println("5.删除数字信息");
        System.out.println("0.退出系统");
    }// 显示所有数字信息。

    IntClass[] putAllIntClass(IntClass a[], int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(i + 1 + ":");
            System.out.print("数字：" + a[i].getNum() + '\n');
        }
        return a;

    }// 显示所有数字信息。

    IntClass[] add(IntClass a[], int count, Scanner scan) {
        if (count == a.length) {
            a = IntArray.newArray(a);
        }

        System.out.println("请输入录入数字：");
        int newMake = scan.nextInt();

        a[count] = new IntClass(newMake);

        return a;
    }// 录入数字信息。

    boolean isExist(IntClass a[], int count, Scanner scan) {
        System.out.println("请输入要查找的数字：");
        int num = scan.nextInt();
        for (int i = 0; i < count; i++) {
            if (a[i].getNum() == num) {
                System.out.print("数字：" + a[i].getNum());
                System.out.println(" 在系统中的位置为：" + i);
                return true;
            }
        }
        System.out.println("查无此数字");
        return false;
    }// 查找数字信息。


    static int quickSortOneTime(IntClass[] a, int low, int high) {
        // ⼀一趟快速排序
        int key = a[low].getNum();
        while (low < high) {
            while (key < a[high].getNum() && low < high)
                high--;
            a[low].setNum(a[high].getNum());
            while (key > a[low].getNum() && low < high)
                low++;
            a[high].setNum(a[low].getNum());
        }
        a[high].setNum(key);
        return high;
    }
    
    static int Select_k(IntClass[] a, int low, int high, int k) {
        int index;
        if (low == high)
            return a[low].getNum();
        int partition = quickSortOneTime(a, low, high);
        index = high - partition + 1;
        if (index == k) {
            return a[partition].getNum();
        } else if (index < k) {
            // 此时向左查找
            return Select_k(a, low, partition - 1, k - index);
            // 查找的是相对位置的值，k在左段中的下标为k-index
        } else {
            return Select_k(a, partition + 1, high, k);
        }
    }

    int getnthNumber(IntClass a[], int count, Scanner scan) {
        System.out.println("请输入要获得的第: " + "大数字：");
        int Nth = scan.nextInt();
        int NthNum = Select_k(a, 0, a.length - 1, Nth);
        System.out.println("第" + (Nth) + "大的数字是：" + NthNum);
        return NthNum;
    }// 查找第k大的数。

    IntClass[] delete(IntClass a[], int count, Scanner scan) {
        System.out.println("请输入要删除的数字序号：");
        int IntClassNum = scan.nextInt();
        for (int i = 0; i < count; i++) {
            if (a[i].getNum() == IntClassNum) {
                for (int j = i + 1; j < count; j++) {
                    a[j-1] = a[j];
                }
                return a;
            }
        }
        System.out.println("系统中无此数字");
        return a;
    }// 删除数字信息

    static IntClass[] newArray(IntClass a[]) {
        IntClass[] newArray = new IntClass[a.length + 1];
        for (int i = 0; i < a.length; i++)
            newArray[i] = a[i];
        return newArray;
    }
}
