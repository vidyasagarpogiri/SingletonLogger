/**
 * Created by Сергей on 09.07.2017.
 */
public class Logger {
    private static Logger logger;                                // 1. Creating an reference
    private static String logFile = "This is log file! \n\n";
    public static synchronized Logger getLogger(){               // 2. Creating a getter

        if(logger == null){
            logger = new Logger();                               //3. Creating an object
        }
        return logger;
    }
    private Logger (){                                          // 4. Creating a private constructor

    }
    public void addLogInfo(String logInfo){
    logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }


}
