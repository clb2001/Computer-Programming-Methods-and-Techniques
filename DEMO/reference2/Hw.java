package reference2;

import java.util.Scanner;
 
public class Hw {
    public static void main(String[] args) {
        int count = 1;
        int redFlag = 1;
        Stu a[] = new Stu[1];
        a[0] = new Stu("84G0235", "小雅", "女", 18, 89);
 
        Scanner scan = new Scanner(System.in);
        Hw test = new Hw();
        System.out.println("欢迎来到学生信息管理系统");
        while (redFlag == 1) {
            test.putMenu();
            int data0 = scan.nextInt();
            switch (data0) {
            case 0:
                redFlag = 0;
                break;
            case 1:
                test.putAllStu(a, count);
                break;
            case 2:
                a = test.inPutStu(a, count,scan);
                count++;
 
                // 如果数组中已实例化元素个数等于a的长度，扩容
                break;
            case 3:
                test.selectStu(a, count, scan);
                break;
            case 4:
                a = test.reSetStu(a, count , scan);
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
        System.out.println("1.显示所有学生信息");
        System.out.println("2.录入学生信息");
        System.out.println("3.查询学生信息");
        System.out.println("4.修改学生信息");
        System.out.println("5.删除学生信息");
        System.out.println("0.退出系统");
    }// 显示所有学生信息。
 
    Stu[] putAllStu(Stu a[], int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(i + 1 + ":");
            System.out.print("学号：" + a[i].getStuNum());
            System.out.print(" 姓名：" + a[i].getName());
            System.out.print(" 性别：" + a[i].getGender());
            System.out.print(" 年龄：" + a[i].getAge());
            System.out.println(" 成绩：" + a[i].getMark());
 
        }
        return a;
 
    }// 显示所有学生信息。
 
    Stu[] inPutStu(Stu a[], int count,Scanner scan) {
        if (count == a.length) {
            a = Hw.newArray(a);
        }
       
        System.out.println("请输入录入学生学号：");
        String newStuNum = scan.next().trim();
 
        System.out.println("请输入录入学生姓名：");
        String newName = scan.next().trim();
 
        System.out.println("请输入录入学生性别：");
        String newGender = scan.next().trim();
        while (true) {
            if (newGender.equals("男") || newGender.equals("女")) {
                break;
            } else {
                System.out.println("输入有误，重新输入");
                newGender = scan.next();
            }
 
        }
 
        System.out.println("请输入录入学生年龄：");
        int newAge = scan.nextInt();
 
        System.out.println("请输入录入学生成绩：");
        int newMake = scan.nextInt();
 
        a[count] = new Stu(newStuNum, newName, newGender, newAge, newMake);
 
        return a;
    }// 录入学生信息。
 
    void selectStu(Stu a[], int count ,Scanner scan) {        
        System.out.println("请输入要查找的学生姓名：");
        String name = scan.next().trim();
        for (int i = 0; i < count; i++) {
            if (a[i].getName().equals(name)) {
                System.out.print("学号：" + a[i].getStuNum());
                System.out.print(" 姓名：" + a[i].getName());
                System.out.print(" 性别：" + a[i].getGender());
                System.out.print(" 年龄：" + a[i].getAge());
                System.out.print(" 成绩：" + a[i].getMark());
                System.out.println(" 在系统中的位置为：" + i);
                
                return ;    
            }
        }
        System.out.println("查无此人");
        return ;
    }// 查找学生信息。
 
    Stu[] reSetStu(Stu a[], int count,Scanner scan) {
        System.out.println("请输入要修改的学生学号：");
        String stuNum = scan.next().trim();
        for (int i = 0; i < count; i++) {
            if (a[i].getStuNum().equals(stuNum)) {
                System.out.println("您将要修改的学生信息如下：");
                System.out.print("学号：" + a[i].getStuNum());
                System.out.print(" 姓名：" + a[i].getName());
                System.out.print(" 性别：" + a[i].getGender());
                System.out.print(" 年龄：" + a[i].getAge());
                System.out.println(" 成绩：" + a[i].getMark());
                System.out.println("请选择您要修改的项目，输入0退出");
                System.out.println("1.学号：");
                System.out.println("2.姓名：");
                System.out.println("3.性别：");
                System.out.println("4.年龄：");
                System.out.println("5.成绩：");
                int flag = 1;
                while (flag != 0) {
                    flag = scan.nextInt();
                    switch (flag) {
                    case 1:
                        System.out.println("请输入新的信息");
                        String newStuNum = scan.next();
                        a[i].setStuNum(newStuNum);
                        break;
                    case 2:
                        System.out.println("请输入新的信息");
                        String newName = scan.next();
                        a[i].setStuNum(newName);
                        break;
                    case 3:
                        System.out.println("请输入新的信息");
                        String newGender = scan.next();
                        while (true) {
                            if (newGender.equals("男") || newGender.equals("女")) {
                                break;
                            } else {
                                System.out.println("输入有误，重新输入");
                                newGender = scan.next();
                            }
 
                        }
                        a[i].setStuNum(newGender);
                        break;
                    case 4:
                        System.out.println("请输入新的信息");
                        int newAge = scan.nextInt();
                        a[i].setAge(newAge);
                        break;
                    case 5:
                        System.out.println("请输入新的信息");
                        int newMark = scan.nextInt();
                        a[i].setMark(newMark);
                        break;
                    default:
                        System.out.println("请输入正确数字");
                    }
                    System.out.println("请继续选择您要修改的项目，输入0退出");
                }
                System.out.println("您修改后的学生信息如下：");
                System.out.print("学号：" + a[i].getStuNum());
                System.out.print(" 姓名：" + a[i].getName());
                System.out.print(" 性别：" + a[i].getGender());
                System.out.print(" 年龄：" + a[i].getAge());
                System.out.println(" 成绩：" + a[i].getMark());
                
                return a;
            }
          
        }
         System.out.println("系统中无此学生");
         return a;
    }// 修改学生信息。
 
    Stu[] delete(Stu a[], int count,Scanner scan) {
        System.out.println("请输入要删除的学生学号：");
        String stuNum = scan.nextLine();
        for (int i = 0; i < count; i++) {
            if (a[i].getStuNum().equals(stuNum)) {
                for (int j = i + 1; j < count; j++) {
                    a[j - 1] = a[j];
                }
            return a;
            }
        }
        System.out.println("系统中无此学生");
        return a;
    }// 删除学生信息
 
    static Stu[] newArray(Stu a[]) {
        Stu[] newArray = new Stu[a.length + a.length];
        for (int i = 0; i < a.length; i++)
            newArray[i] = a[i];
        return newArray;
    }
}// 数组扩容