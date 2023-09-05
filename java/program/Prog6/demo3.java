package Prog6;

class Student {
    char name[] = new char[10];
    double gpa;
    int studentID;

    // 方法的访问控制
    // final void setName(char[] studentName)
    // 采用private修饰，依然允许重载
    void setName(char[] studentName) {
        name = new char[10];
        for (int j = 0; j < name.length && j < studentName.length; j++) {
            // 只取前10个
            name[j] = studentName[j];
        }
    }

    void setGPA(double studentGPA) {
        gpa = studentGPA;
    }

    boolean compareSID(Student s2) {
        return studentID > s2.studentID;
    }

    boolean compareGPA(Student s2) {
        return gpa > s2.gpa;
    }

    void printRecord() {
        System.out.println("Student: " + String.valueOf(name)
                + ", ID = " + studentID + ", GPA = " + gpa);
    }
};

public class demo3 {
    // Student students[];
    Student2 students[];

    void StudentRecord() {
        int n = 10;
        // students = new Student[n];
        students = new Student2[n];
        for (int i = 0; i < n; i++) {
            // students[i] = new Student();
            students[i] = new Student2();
            students[i].setGPA(3.61);
            // students[i].setName();
            String name = "abc";
            char[] charName = name.toCharArray();
            students[i].setName(charName);
        }
    }

    void printStudents() {
        System.out.println("Student: " + String.valueOf(students[0].name)
                + ", ID = " + students[0].studentID + ", GPA = " + students[0].gpa);
    }

    public static void main(String[] args) {
        demo3 studentRecord = new demo3();
        studentRecord.printStudents();

        // 方法的覆盖
        Student2 student = new Student2();
        student.printRecord();
        // 方法的覆盖
        String name = "YZ";

        // 以下两种操作分别调用了哪个类里的什么方法？
        student.setName(name);
        student.setName(name.toCharArray());
    }
}

class Student2 extends Student {
    String address;
    // 子类的同名变量，就近原则
    String name;

    void printRecord() {
        super.printRecord();
        System.out.println("---Address: " + address);
    }

    void setName(String studentName) {
        name = studentName;
        super.setName(studentName.toCharArray());
    }
};

// 允许多次继承
class Student3 extends Student2 { 
    String email;
};

class Student4 extends Student2 { 
    float scores[];
};

// 构造顺序：先父类，后子类
// 类内部的构造顺序: static 类的引用 = new …，先构造
// 类的引用 = new …，次之
// 如果声明时没有加 “= new …”，则仅声明，不构造
// 再执行构造函数
// Java不允许多重继承