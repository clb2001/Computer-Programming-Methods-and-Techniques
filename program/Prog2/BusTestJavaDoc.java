package Prog2;
//了解一下代码注释

/**
 * 汽车类的简介
 * <p>
 * 汽车类具体阐述第一行<br>
 * 汽车类具体阐述第二行
 * 
 * @author man
 * @author man2
 * @version 1.0
 * @see ship
 * @see aircraft
 */
public class BusTestJavaDoc {
    public int maxSpeed;
    public int averageSpeed;
    public int waterTemperature;
    public int Temperature;

    BusTestJavaDoc() {
    }

    /**
     * 用来标识汽车行驶当中最大速度
     * 
     * @see #averageSpeed
     */
    public int measureAverageSpeed(int start, int end) {
        int aspeed = 12;
        return aspeed;
    }

    /** 用来标识汽车行驶当中平均速度 */
    public int measureMaxSpeed() {
        return maxSpeed;
    }
}
