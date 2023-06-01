package Prog5;

public class Student {
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

    boolean compareSID(Student s2) {
        return studentID > s2.studentID;
    }

    boolean compareGPA(Student s2) {
        return gpa > s2.gpa;
    }

    void printRecord() {
    System.out.println("Student: "+ String.valueOf(name) + ", ID = " + studentID + ", GPA = " + gpa);
    }
};
