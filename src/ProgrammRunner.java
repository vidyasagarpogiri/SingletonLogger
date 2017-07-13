/**
 * Created by Сергей on 09.07.2017.
 */
public class ProgrammRunner {
    public static void main(String[]args){

        Logger.getLogger().addLogInfo("It is first log...");
        Logger.getLogger().addLogInfo("It is secound log...");
        Logger.getLogger().addLogInfo("It is third log...");

        Logger.getLogger().showLogFile();

    }
}
