package Prog11;

//单例模式
class Log {
    private static class LogHolder {
        private static final Log INSTANCE = new Log();
    }

    public static Log getInstance() {
        return LogHolder.INSTANCE;
    }

    private Log() {
        // 初始化, 如打开日志文件
    }

    public void logError(String log) {

    }
}

public class demo11 {
    public static void main(String argv[]) {
        Log.getInstance().logError("This is a log record");
    }
}
