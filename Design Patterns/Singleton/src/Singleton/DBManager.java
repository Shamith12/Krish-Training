package Singleton;

public class DBManager {
    private static volatile DBManager dbManager; //= new DBManager();

    private DBManager(){
        if(dbManager != null){
            throw new RuntimeException("Please use getManager method");
        }
    }

    public static DBManager getDbManager(){
        if(dbManager == null){
            synchronized(DBManager.class){
                if(dbManager != null){
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
}
