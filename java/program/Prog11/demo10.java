package Prog11;

class Log {
    private volatile static Log instance = null;

    public static Log getInstance() {
        if (instance == null) {
            synchronized (Log.class) {// 作为锁的对象
                if (instance == null) {
                    Log instance = new Log();
                }
            }
        }
        return instance;
    }

    private Log() {
        // 初始化, 如打开日志文件
    }

    public void logError(String log) {

    }
}

public class demo10 {
    public static void main(String argv[]){
        Log.getInstance().logError("This is a log record");
    }
}
