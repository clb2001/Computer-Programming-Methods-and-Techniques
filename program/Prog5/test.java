package week6;

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

class NewElement extends Element {
    private Student student;

    public void setRecord(Student rec) {
        student = rec;
    }

    // public Student getRecord() {
    //     return rec;
    // }
}

public class test {

}
