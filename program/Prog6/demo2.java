package Prog6;

class Student {
    char name[] = new char[10];
    double gpa;
    int studentID;

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

public class demo2 {
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
            students[i].setAddress("HuangShan");
        }
    }

    void printStudents() {
        System.out.println("Student: " + String.valueOf(students[0].name)
                + ", ID = " + students[0].studentID + ", GPA = " + students[0].gpa);
    }

    public static void main(String[] args) {
        demo2 studentRecord = new demo2();
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

// 新增数据怎么处理？采用继承
class Student2 extends Student {
    String address;
    // 子类的同名变量，就近原则
    String name;
    // 如果需要用到父类的同名变量，使用super关键字

    void setAddress(String studentAddress) {
        address = studentAddress;
    }

    // Student2对Student方法的覆盖
    void printRecord() {
        System.out.println("Student: " + String.valueOf(name)
                + ", ID = " + studentID + ", GPA = " + gpa);
        System.out.println("---Address: " + address);
    }

    // 注意以下三种方式实现setName操作的区别，什么时候分别成立？

    // void setName(String studentName) {
    // name = studentName;
    // }

    // Student2对Student方法的重载
    // void setName(String studentName) {
    // char[] charName = studentName.toCharArray();
    // name = new char[10];
    // for (int j = 0; j < name.length && j < charName.length; j++) {
    // // 只取前10个
    // name[j] = charName[j];
    // }
    // }

    void setName(String studentName) {
        name = studentName;
        char[] charName = studentName.toCharArray();
        super.name = new char[10];
        for (int j = 0; j < name.length() && j < charName.length; j++) {
            // 只取前10个
            super.name[j] = charName[j];
        }
    }
};

// 方法复用？->方法覆盖以及方法重载