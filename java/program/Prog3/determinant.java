package Prog3;

import java.lang.reflect.Method;
import java.util.Scanner;

// 实现行列式的计算
public class determinant {

    // 处理nextLine() 第一次自动读回车的缺陷
    private boolean flag = true;
    // 由于需要输入数据,设置一个全局的输入流
    private Scanner scan;

    // 由于行列式是二维的,所以使用 二维数组进行存储
    // 数据类型可能出现浮点
    private double[][] arr;

    // 储存阶数
    private int size;

    public determinant() {
        // 初始化输入流
        scan = new Scanner(System.in);
    }

    // 使用行列展开进行计算的原理
    public void rlExpanding() {

        // 调用递归函数进行计算,要进行多次数的复制,存在较大的优化空间
        double result = core(size, arr);
        // System.out.println("running...");
        System.out.println("行列式的计算结果为: " + result);
    }

    // 行列式展开方法计算行列式 使用递归
    public double core(int rank, double[][] a) {

        if (rank > 2) {
            // ----------------核心代码--------------------
            double result = 0;

            for (int k = 0; k < rank; k++) {
                // 取出余子式
                double[][] newArr = new double[rank - 1][rank - 1];
                int index = 0;
                // 对数组进行赋值
                for (int i = 0; i < rank; i++) {
                    if (k != i) {
                        for (int j = 1; j < rank; j++) {
                            // 如果该行不等于所在行
                            newArr[index][j - 1] = a[i][j];
                        }
                        // 到第下一行赋值
                        index++;
                    }
                }

                // 重点注意 由于此处取的是 a11 所以 (-1)^(1+1) = 1 可以进行处理
                result += Math.pow(-1, (k + 1 + 1)) * a[k][0] * core(rank - 1, newArr);
            }
            // --------------------------------------
            return result;
        } else {
            // 二级行列式计算
            return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        }

    }

    // 业务处理层
    public void service(String method) throws Exception {

        while (true) {
            int row = readRow();
            if (row != 0) {
                // 初始化成功
                // 数据的输入
                while (readData(row)) {
                    // 数据录入成功,可以进行计算
                    // 通过反射,获取method方法进行计算 jdk1.8以上可以使用
                    try {
                        Class<determinant> clazz = determinant.class;
                        Method m = clazz.getMethod(method);
                        if (m != null) {
                            m.invoke(this);

                            System.out.println("-------------------------------------");
                            System.out.print("是否继续计算(输入0继续):");
                            if (scan.nextInt() != 0) {
                                System.exit(0);
                            } else {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        // 调用反射是出错
                        return;
                    }
                }
            }
            ;
        }
    }

    // 输入行列式的阶数 限制行列的大小为20以内
    public int readRow() throws Exception {
        System.out.println("-------------------------determinant----------------------------");
        System.out.print("请输入要计算的行列式的阶数:");

        int row = scan.nextInt();
        size = row;
        // 限制只能计算20阶以内的行列式
        if (row > 1 && row <= 20) {
            // 初始化 数据
            arr = new double[row][row];
            return row;
        }
        return 0;
    }

    /**
     * 读取数据
     * 
     * @return 判断用户是否选择退出程序,并进行重新操作
     */
    public boolean readData(int row) {
        try {
            System.out.println("输入行列式的数据(输入一行之后回车,每个数据之间使用空格进行分隔):");
            // 处理nextLine() 第一次自动读回车的缺陷
            // if (flag)
            // {
            // scan.nextLine();
            // flag=false;
            // }
            scan.nextLine();
            for (int i = 0; i < row; i++) {
                System.out.print("第" + (i + 1) + "行: ");
                String line = scan.nextLine();
                String[] data = line.trim().split(" ");
                if (data.length != row) {
                    System.out.println("数据输入格式错误,请重新输入(从第1行开始):");
                    i = -1;
                } else {
                    for (int j = 0; j < row; j++) {
                        // 此处可能会报错,由于用户输入的错误信息
                        arr[i][j] = Double.parseDouble(data[j]);
                    }
                }
            }
            System.out.println("数据输入录入成功,正在计算行列式,请等待...");
        } catch (NumberFormatException e) {
            // 数据输入错误,进行处理
            System.out.println("输入的数据有误,正在重新执行输入函数...");
            return false;
        }
        return true;
    }

    // main函数的作用为分发,以及接受参数 初始
    public static void main(String[] args) {

        determinant determinant = new determinant();

        String method = "rlExpanding";
        if (args != null && args.length > 0 && args[0] != null && "".equals(args[0])) {
            method = args[0];
        }
        try {
            determinant.service(method);
        } catch (Exception e) {
            // 出现错误进行统一处理
            // 直接判断可能出现的错误为 输入的参数有误
            System.out.println("启动失败,请检查输入命令的参数是否有误");

        }
    }
}
