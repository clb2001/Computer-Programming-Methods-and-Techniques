package Prog8;

class Datum {
    private Object var;

    public Object getVar() {
        return var;
    }

    public void setVar(Object var) {
        this.var = var;
    }
}

// 跟泛型比有何劣势呢？
public class demo7 {
    public static void main(String args[]) {
        Datum datum = new Datum();
        datum.setVar("Wrong");// 语法符合，因为String是Object的子类
        // System.out.println(2 * (Integer) datum.getVar());会报错！
    }
}
