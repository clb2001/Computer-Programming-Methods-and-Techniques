package ThreadSync;

public class EmuExe {
    static void execute() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (Exception e) {
        }
    }
}
