import java.text.SimpleDateFormat;
import java.util.*;

class LogItem {
    private String log = new String();
    private Date time = new Date(0);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
    public LogItem() {
    }
    public LogItem(long time, String log) {
        setTime(time);
        setLog(log);
    }
    public void setTime(long time) {
        this.time.setTime(time + 25200000L);
    }
    public void setLog(String log) {
        this.log = log;
    }
    public void setLogItem(long time, String log) {
        setTime(time);
        setLog(log);
    }
    public Date getTime() {
        return time;
    }
    public String getFormatTime() {
        return dateFormat.format(time);
    }
    public String getLog() {
        return log;
    }
    @Override
    public String toString() {
        return getFormatTime() + "| " + getLog() + ";";
    }
}
class LogData {
    private static LinkedList<LogItem> arrData = new LinkedList<>();
    private static LogItem recentLog = new LogItem();
    public static void addLog(LogItem log) {
        if(log.getTime().after(recentLog.getTime())) recentLog = log;
        arrData.add(log);
    }
    public static LogItem getRecentLog() {
        return recentLog;
    }
    public static void printAllLog(){
        for(LogItem log : arrData) {
            System.out.println(log);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLog = scanner.nextInt();
        while (numLog-- > 0) {
            long time = scanner.nextLong();
            String log = scanner.nextLine();
            log = log.substring(1, log.length());
            LogItem logItem = new LogItem(time, log);
            LogData.addLog(logItem);
        }
        System.out.println("LASTEST LOG: " + LogData.getRecentLog());
        LogData.printAllLog();
    }
}