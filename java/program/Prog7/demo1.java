package Prog7;

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

class Element {
    private int n;
    private Element next;

    public void setNext(Element nextElement) {
        next = nextElement;
    }

    public void setNum(int num) {
        n = num;
    }

    public int getNum() {
        return n;
    }

    public Element getNext() {
        return next;
    }
}

// 把NewElement的对象当做其父类Element的对象来使用
class NewElement extends Element {
    private Student student;

    public void setRecord(Student rec) {
        student = rec;
    }

    public Student getRecord() {
        return student;
    }

}

public class demo1 {
    NewElement a = new NewElement();
    Element b = a;
    // 除了继承关系，否则不允许类型转换
    // (NewElement)b.setRecord();
}
