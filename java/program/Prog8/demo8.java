package Prog8;

class Datum<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var2) {
        var = var2;
    }
}

public class demo8 {
    public static void main(String args[]) {
        // 泛型的实例化
        Datum<Integer> datum = new Datum<Integer>();
        // datum.setVar("Wrong");
        // The method setVar(Integer) in the type Datum<Integer> is not applicable for the arguments (String)
        // System.out.println(2 * (Integer) datum.getVar());
    }
}
