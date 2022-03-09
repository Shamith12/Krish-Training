package Singleton;

public class Application {
    public static void main(String[] args) {
        DBManager dbManager = DBManager.getDbManager();
        System.out.println(dbManager);

        DBManager dbManager1 = DBManager.getDbManager();
        System.out.println(dbManager1);
    }
}
